package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xmainpage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _texturl = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnstart = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="textURL.Text = \"https://github.com/CNT9E/Chew-WGA";
__ref._texturl /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("https://github.com/CNT9E/Chew-WGA-V0.9/releases/download/0.9/Chew.WGA.V0.9.rar");
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="End Sub";
return "";
}
public void  _btnstart_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnstart_click", false))
	 {Debug.delegate(ba, "btnstart_click", null); return;}
ResumableSub_btnStart_Click rsub = new ResumableSub_btnStart_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnStart_Click extends BA.ResumableSub {
public ResumableSub_btnStart_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _surl = "";
String _stext = "";
String _sfile = "";
boolean _success = false;
String _sres = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim sUrl As String = textURL.Text";
_surl = __ref._texturl /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="If sUrl.Trim <> \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_surl.trim()).equals("") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="btnStart.Enabled = False";
__ref._btnstart /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Dim sText As String = btnStart.Text";
_stext = __ref._btnstart /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getText();
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="btnStart.Text = \"已启动...\"";
__ref._btnstart /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setText("已启动...");
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Dim sFile As String = File.GetName(sUrl)";
_sfile = parent.__c.File.GetName(_surl);
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Log(sFile)";
parent.__c.LogImpl("3720904",_sfile,0);
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Wait For (DownloadAndTrackProgress(sUrl, sFile))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btnstart_click"), __ref._downloadandtrackprogress /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_surl,_sfile));
this.state = 5;
return;
case 5:
//C
this.state = 4;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="Dim sRes As String = IIf(Success, \"下载成功\", \"下载失败\"";
_sres = BA.ObjectToString(((_success) ? ((Object)("下载成功")) : ((Object)("下载失败"))));
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="xui.MsgboxAsync(sRes, \"结束\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_sres,"结束");
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="btnStart.Text = sText";
__ref._btnstart /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setText(_stext);
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="btnStart.Enabled = True";
__ref._btnstart /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(parent.__c.True);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadandtrackprogress(b4j.example.b4xmainpage __ref,String _url,String _sfile) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "downloadandtrackprogress", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "downloadandtrackprogress", new Object[] {_url,_sfile}));}
ResumableSub_DownloadAndTrackProgress rsub = new ResumableSub_DownloadAndTrackProgress(this,__ref,_url,_sfile);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadAndTrackProgress extends BA.ResumableSub {
public ResumableSub_DownloadAndTrackProgress(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _url,String _sfile) {
this.parent = parent;
this.__ref = __ref;
this._url = _url;
this._sfile = _sfile;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _url;
String _sfile;
b4j.example.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _tasktojob = null;
int _taskid = 0;
int _id = 0;
boolean[] _b = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Dim TaskToJob As Map = HttpUtils2Service.TaskIdTo";
_tasktojob = new anywheresoftware.b4a.objects.collections.Map();
_tasktojob = parent._httputils2service._taskidtojob /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="Do While HttpUtils2Service.TaskIdToJob.IsInitiali";
if (true) break;

case 1:
//do while
this.state = 4;
while (parent._httputils2service._taskidtojob /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==parent.__c.False) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="Sleep(30)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "downloadandtrackprogress"),(int) (30));
this.state = 17;
return;
case 17:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="Dim TaskId As Int";
_taskid = 0;
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="For Each id As Int In TaskToJob.Keys";
if (true) break;

case 5:
//for
this.state = 12;
group9 = _tasktojob.Keys();
index9 = 0;
groupLen9 = group9.getSize();
this.state = 18;
if (true) break;

case 18:
//C
this.state = 12;
if (index9 < groupLen9) {
this.state = 7;
_id = (int)(BA.ObjectToNumber(group9.Get(index9)));}
if (true) break;

case 19:
//C
this.state = 18;
index9++;
if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="If TaskToJob.Get(id) = j Then";
if (true) break;

case 8:
//if
this.state = 11;
if ((_tasktojob.Get((Object)(_id))).equals((Object)(_j))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="TaskId = id";
_taskid = _id;
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Exit";
this.state = 12;
if (true) break;
 if (true) break;

case 11:
//C
this.state = 19;
;
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="Dim b() As Boolean = Array As Boolean(False)";
_b = new boolean[]{parent.__c.False};
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="TrackProgress(j, b, TaskId)";
__ref._trackprogress /*void*/ (null,_j,_b,_taskid);
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "downloadandtrackprogress"), (Object)(_j));
this.state = 20;
return;
case 20:
//C
this.state = 13;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="b(0) = True";
_b[(int) (0)] = parent.__c.True;
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="If j.Success Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_j._success /*boolean*/ ) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.C";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.Combine(parent.__c.GetSystemProperty("user.home",""),"Desktop"),_sfile,parent.__c.False);
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="out.Close '<------ very important";
_out.Close();
RDebugUtils.currentLine=786461;
 //BA.debugLineNum = 786461;BA.debugLine="Log(\"下载结束\")";
parent.__c.LogImpl("3786461","下载结束",0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=786464;
 //BA.debugLineNum = 786464;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="Return j.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_j._success /*boolean*/ ));return;};
RDebugUtils.currentLine=786466;
 //BA.debugLineNum = 786466;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Private textURL As TextField";
_texturl = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Private btnStart As Button";
_btnstart = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="End Sub";
return "";
}
public void  _trackprogress(b4j.example.b4xmainpage __ref,b4j.example.httpjob _j,boolean[] _stop,int _taskid) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "trackprogress", false))
	 {Debug.delegate(ba, "trackprogress", new Object[] {_j,_stop,_taskid}); return;}
ResumableSub_TrackProgress rsub = new ResumableSub_TrackProgress(this,__ref,_j,_stop,_taskid);
rsub.resume(ba, null);
}
public static class ResumableSub_TrackProgress extends BA.ResumableSub {
public ResumableSub_TrackProgress(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,b4j.example.httpjob _j,boolean[] _stop,int _taskid) {
this.parent = parent;
this.__ref = __ref;
this._j = _j;
this._stop = _stop;
this._taskid = _taskid;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
b4j.example.httpjob _j;
boolean[] _stop;
int _taskid;
long _totallength = 0L;
long _size = 0L;
String _sprogress = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Do While Stop(0) = False";
if (true) break;

case 1:
//do while
this.state = 8;
while (_stop[(int) (0)]==parent.__c.False) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="If j.Out.IsInitialized Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_j._out /*anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper*/ .IsInitialized()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Dim TotalLength As Long = j.Response.ContentLen";
_totallength = _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getContentLength();
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Dim size As Long = File.Size(HttpUtils2Service.";
_size = parent.__c.File.Size(parent._httputils2service._tempfolder /*String*/ ,BA.NumberToString(_taskid));
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Dim sProgress As String = $\"进度: $0.1{100 * (siz";
_sprogress = ("进度: "+parent.__c.SmartStringFormatter("0.1",(Object)(100*(_size/(double)_totallength)))+"%");
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="btnStart.Text = sProgress";
__ref._btnstart /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setText(_sprogress);
 if (true) break;

case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "trackprogress"),(int) (100));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
}