B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'浏览器下载文件老是说有病毒, 虚拟机又连不上, 只能自己写个下载器了

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private textURL As TextField
	Private btnStart As Button
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	textURL.Text = "https://github.com/CNT9E/Chew-WGA-V0.9/releases/download/0.9/Chew.WGA.V0.9.rar"
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnStart_Click
	'In B4A you need to add to manifest editor: CreateResourceFromFile(Macro, Core.NetworkClearText)
	Dim sUrl As String = textURL.Text
	If sUrl.Trim <> "" Then
		btnStart.Enabled = False
		Dim sText As String = btnStart.Text
		btnStart.Text = "已启动..."
		Dim sFile As String = File.GetName(sUrl)
		Log(sFile)
		Wait For (DownloadAndTrackProgress(sUrl, sFile)) Complete (Success As Boolean)
		Dim sRes As String = IIf(Success, "下载成功", "下载失败")
		xui.MsgboxAsync(sRes, "结束")
		btnStart.Text = sText
		btnStart.Enabled = True
	End If
End Sub

Private Sub DownloadAndTrackProgress (url As String, sFile As String) As ResumableSub
	Dim j As HttpJob
	j.Initialize("", Me)
	j.Download(url)
    #if debug
	'delete if using B4J v9.0+
    'Sleep(0)
    #End If
	Dim TaskToJob As Map = HttpUtils2Service.TaskIdToJob
	Do While HttpUtils2Service.TaskIdToJob.IsInitialized = False
		Sleep(30)
	Loop
       
	Dim TaskId As Int
	For Each id As Int In TaskToJob.Keys
		If TaskToJob.Get(id) = j Then
			TaskId = id
			Exit
		End If
	Next
	Dim b() As Boolean = Array As Boolean(False)
	TrackProgress(j, b, TaskId)
	Wait For (j) JobDone (j As HttpJob)
	b(0) = True
   
	If j.Success Then
		Dim out As OutputStream = File.OpenOutput(File.Combine(GetSystemProperty("user.home", ""), "Desktop"), sFile, False)
		File.Copy2(j.GetInputStream, out)
		out.Close '<------ very important
		Log("下载结束")
	End If
   
	j.Release
	Return j.Success	
End Sub

Private Sub TrackProgress (j As HttpJob, Stop() As Boolean, TaskId As Int)
	Do While Stop(0) = False
		If j.Out.IsInitialized Then
			Dim TotalLength As Long = j.Response.ContentLength
			Dim size As Long = File.Size(HttpUtils2Service.TempFolder, TaskId)
			'Dim sProgress As String = size & ", " & TotalLength
			Dim sProgress As String = $"进度: $0.1{100 * (size / TotalLength)}%"$
			btnStart.Text = sProgress
		End If
		Sleep(100)
	Loop
End Sub
