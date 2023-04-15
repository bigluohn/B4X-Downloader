package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 22;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Root = Root1";
Debug.ShouldStop(4194304);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 24;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="textURL.Text = \"https://github.com/CNT9E/Chew-WGA";
Debug.ShouldStop(16777216);
__ref.getField(false,"_texturl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("https://github.com/CNT9E/Chew-WGA-V0.9/releases/download/0.9/Chew.WGA.V0.9.rar"));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnstart_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnStart_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("btnstart_click")) { __ref.runUserSub(false, "b4xmainpage","btnstart_click", __ref); return;}
ResumableSub_btnStart_Click rsub = new ResumableSub_btnStart_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnStart_Click extends BA.ResumableSub {
public ResumableSub_btnStart_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _surl = RemoteObject.createImmutable("");
RemoteObject _stext = RemoteObject.createImmutable("");
RemoteObject _sfile = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _sres = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnStart_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,30);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 32;BA.debugLine="Dim sUrl As String = textURL.Text";
Debug.ShouldStop(-2147483648);
_surl = __ref.getField(false,"_texturl" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("sUrl", _surl);Debug.locals.put("sUrl", _surl);
 BA.debugLineNum = 33;BA.debugLine="If sUrl.Trim <> \"\" Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_surl.runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 34;BA.debugLine="btnStart.Enabled = False";
Debug.ShouldStop(2);
__ref.getField(false,"_btnstart" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 35;BA.debugLine="Dim sText As String = btnStart.Text";
Debug.ShouldStop(4);
_stext = __ref.getField(false,"_btnstart" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("sText", _stext);Debug.locals.put("sText", _stext);
 BA.debugLineNum = 36;BA.debugLine="btnStart.Text = \"已启动...\"";
Debug.ShouldStop(8);
__ref.getField(false,"_btnstart" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("已启动..."));
 BA.debugLineNum = 37;BA.debugLine="Dim sFile As String = File.GetName(sUrl)";
Debug.ShouldStop(16);
_sfile = parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_surl));Debug.locals.put("sFile", _sfile);Debug.locals.put("sFile", _sfile);
 BA.debugLineNum = 38;BA.debugLine="Log(sFile)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","3720904",_sfile,0);
 BA.debugLineNum = 39;BA.debugLine="Wait For (DownloadAndTrackProgress(sUrl, sFile))";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "btnstart_click"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_downloadandtrackprogress" /*RemoteObject*/ ,(Object)(_surl),(Object)(_sfile)));
this.state = 5;
return;
case 5:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 40;BA.debugLine="Dim sRes As String = IIf(Success, \"下载成功\", \"下载失败\"";
Debug.ShouldStop(128);
_sres = BA.ObjectToString(((_success.<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable(("下载成功"))) : ((RemoteObject.createImmutable("下载失败")))));Debug.locals.put("sRes", _sres);Debug.locals.put("sRes", _sres);
 BA.debugLineNum = 41;BA.debugLine="xui.MsgboxAsync(sRes, \"结束\")";
Debug.ShouldStop(256);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(_sres),(Object)(RemoteObject.createImmutable("结束")));
 BA.debugLineNum = 42;BA.debugLine="btnStart.Text = sText";
Debug.ShouldStop(512);
__ref.getField(false,"_btnstart" /*RemoteObject*/ ).runMethod(true,"setText",_stext);
 BA.debugLineNum = 43;BA.debugLine="btnStart.Enabled = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_btnstart" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 12;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 13;BA.debugLine="Private textURL As TextField";
b4xmainpage._texturl = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_texturl",b4xmainpage._texturl);
 //BA.debugLineNum = 14;BA.debugLine="Private btnStart As Button";
b4xmainpage._btnstart = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnstart",b4xmainpage._btnstart);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _downloadandtrackprogress(RemoteObject __ref,RemoteObject _url,RemoteObject _sfile) throws Exception{
try {
		Debug.PushSubsStack("DownloadAndTrackProgress (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("downloadandtrackprogress")) { return __ref.runUserSub(false, "b4xmainpage","downloadandtrackprogress", __ref, _url, _sfile);}
ResumableSub_DownloadAndTrackProgress rsub = new ResumableSub_DownloadAndTrackProgress(null,__ref,_url,_sfile);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadAndTrackProgress extends BA.ResumableSub {
public ResumableSub_DownloadAndTrackProgress(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _url,RemoteObject _sfile) {
this.parent = parent;
this.__ref = __ref;
this._url = _url;
this._sfile = _sfile;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _url;
RemoteObject _sfile;
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _tasktojob = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _taskid = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _b = null;
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadAndTrackProgress (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,47);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("url", _url);
Debug.locals.put("sFile", _sfile);
 BA.debugLineNum = 48;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(32768);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 49;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(65536);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 50;BA.debugLine="j.Download(url)";
Debug.ShouldStop(131072);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 55;BA.debugLine="Dim TaskToJob As Map = HttpUtils2Service.TaskIdTo";
Debug.ShouldStop(4194304);
_tasktojob = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tasktojob = parent._httputils2service._taskidtojob /*RemoteObject*/ ;Debug.locals.put("TaskToJob", _tasktojob);Debug.locals.put("TaskToJob", _tasktojob);
 BA.debugLineNum = 56;BA.debugLine="Do While HttpUtils2Service.TaskIdToJob.IsInitiali";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//do while
this.state = 4;
while (RemoteObject.solveBoolean("=",parent._httputils2service._taskidtojob /*RemoteObject*/ .runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 BA.debugLineNum = 57;BA.debugLine="Sleep(30)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "downloadandtrackprogress"),BA.numberCast(int.class, 30));
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
 BA.debugLineNum = 60;BA.debugLine="Dim TaskId As Int";
Debug.ShouldStop(134217728);
_taskid = RemoteObject.createImmutable(0);Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 61;BA.debugLine="For Each id As Int In TaskToJob.Keys";
Debug.ShouldStop(268435456);
if (true) break;

case 5:
//for
this.state = 12;
group9 = _tasktojob.runMethod(false,"Keys");
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("id", _id);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 12;
if (index9 < groupLen9) {
this.state = 7;
_id = BA.numberCast(int.class, group9.runMethod(false,"Get",index9));Debug.locals.put("id", _id);}
if (true) break;

case 19:
//C
this.state = 18;
index9++;
Debug.locals.put("id", _id);
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 62;BA.debugLine="If TaskToJob.Get(id) = j Then";
Debug.ShouldStop(536870912);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_tasktojob.runMethod(false,"Get",(Object)((_id))),(_j))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 63;BA.debugLine="TaskId = id";
Debug.ShouldStop(1073741824);
_taskid = _id;Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 64;BA.debugLine="Exit";
Debug.ShouldStop(-2147483648);
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
Debug.locals.put("id", _id);
;
 BA.debugLineNum = 67;BA.debugLine="Dim b() As Boolean = Array As Boolean(False)";
Debug.ShouldStop(4);
_b = RemoteObject.createNewArray("boolean",new int[] {1},new Object[] {parent.__c.getField(true,"False")});Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 68;BA.debugLine="TrackProgress(j, b, TaskId)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_trackprogress" /*void*/ ,(Object)(_j),(Object)(_b),(Object)(_taskid));
 BA.debugLineNum = 69;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "downloadandtrackprogress"), (_j));
this.state = 20;
return;
case 20:
//C
this.state = 13;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 70;BA.debugLine="b(0) = True";
Debug.ShouldStop(32);
_b.setArrayElement (parent.__c.getField(true,"True"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 72;BA.debugLine="If j.Success Then";
Debug.ShouldStop(128);
if (true) break;

case 13:
//if
this.state = 16;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 73;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.C";
Debug.ShouldStop(256);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(parent.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("user.home")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Desktop")))),(Object)(_sfile),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 74;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.ShouldStop(512);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (b4j.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 75;BA.debugLine="out.Close '<------ very important";
Debug.ShouldStop(1024);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 76;BA.debugLine="Log(\"下载结束\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","3786461",RemoteObject.createImmutable("下载结束"),0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 79;BA.debugLine="j.Release";
Debug.ShouldStop(16384);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 80;BA.debugLine="Return j.Success";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_j.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _trackprogress(RemoteObject __ref,RemoteObject _j,RemoteObject _stop,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("TrackProgress (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("trackprogress")) { __ref.runUserSub(false, "b4xmainpage","trackprogress", __ref, _j, _stop, _taskid); return;}
ResumableSub_TrackProgress rsub = new ResumableSub_TrackProgress(null,__ref,_j,_stop,_taskid);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_TrackProgress extends BA.ResumableSub {
public ResumableSub_TrackProgress(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _j,RemoteObject _stop,RemoteObject _taskid) {
this.parent = parent;
this.__ref = __ref;
this._j = _j;
this._stop = _stop;
this._taskid = _taskid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _j;
RemoteObject _stop;
RemoteObject _taskid;
RemoteObject _totallength = RemoteObject.createImmutable(0L);
RemoteObject _size = RemoteObject.createImmutable(0L);
RemoteObject _sprogress = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TrackProgress (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,83);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("j", _j);
Debug.locals.put("Stop", _stop);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 84;BA.debugLine="Do While Stop(0) = False";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//do while
this.state = 8;
while (RemoteObject.solveBoolean("=",_stop.getArrayElement(true,BA.numberCast(int.class, 0)),parent.__c.getField(true,"False"))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 85;BA.debugLine="If j.Out.IsInitialized Then";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 7;
if (_j.getField(false,"_out" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 86;BA.debugLine="Dim TotalLength As Long = j.Response.ContentLen";
Debug.ShouldStop(2097152);
_totallength = _j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getContentLength");Debug.locals.put("TotalLength", _totallength);Debug.locals.put("TotalLength", _totallength);
 BA.debugLineNum = 87;BA.debugLine="Dim size As Long = File.Size(HttpUtils2Service.";
Debug.ShouldStop(4194304);
_size = parent.__c.getField(false,"File").runMethod(true,"Size",(Object)(parent._httputils2service._tempfolder /*RemoteObject*/ ),(Object)(BA.NumberToString(_taskid)));Debug.locals.put("size", _size);Debug.locals.put("size", _size);
 BA.debugLineNum = 89;BA.debugLine="Dim sProgress As String = $\"进度: $0.1{100 * (siz";
Debug.ShouldStop(16777216);
_sprogress = (RemoteObject.concat(RemoteObject.createImmutable("进度: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("0.1")),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),(RemoteObject.solve(new RemoteObject[] {_size,_totallength}, "/",0, 0))}, "*",0, 0)))),RemoteObject.createImmutable("%")));Debug.locals.put("sProgress", _sprogress);Debug.locals.put("sProgress", _sprogress);
 BA.debugLineNum = 90;BA.debugLine="btnStart.Text = sProgress";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btnstart" /*RemoteObject*/ ).runMethod(true,"setText",_sprogress);
 if (true) break;

case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 92;BA.debugLine="Sleep(100)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "trackprogress"),BA.numberCast(int.class, 100));
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
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}