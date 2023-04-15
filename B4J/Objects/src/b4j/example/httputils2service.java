package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class httputils2service extends Object{
public static httputils2service mostCurrent = new httputils2service();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.httputils2service", null);
		ba.loadHtSubs(httputils2service.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.httputils2service", ba);
		}
	}
    public static Class<?> getObject() {
		return httputils2service.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public static anywheresoftware.b4a.objects.collections.Map _taskidtojob = null;
public static String _tempfolder = "";
public static int _taskcounter = 0;
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _completejob(int _taskid,boolean _success,String _errormessage) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "completejob", true))
	 {return ((String) Debug.delegate(ba, "completejob", new Object[] {_taskid,_success,_errormessage}));}
b4j.example.httpjob _job = null;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="Log(\"HttpUtils2Service: job completed multiple t";
anywheresoftware.b4a.keywords.Common.LogImpl("99830406","HttpUtils2Service: job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9830409;
 //BA.debugLineNum = 9830409;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_taskidtojob.Remove((Object)(_taskid));
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="job.success = success";
_job._success /*boolean*/  = _success;
RDebugUtils.currentLine=9830411;
 //BA.debugLineNum = 9830411;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage /*String*/  = _errormessage;
RDebugUtils.currentLine=9830413;
 //BA.debugLineNum = 9830413;BA.debugLine="job.Complete(TaskId)";
_job._complete /*String*/ (null,_taskid);
RDebugUtils.currentLine=9830417;
 //BA.debugLineNum = 9830417;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "hc_responseerror", true))
	 {return ((String) Debug.delegate(ba, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid}));}
b4j.example.httpjob _job = null;
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
anywheresoftware.b4a.keywords.Common.LogImpl("99764865",("ResponseError. Reason: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reason))+", Response: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_response.getErrorResponse()))+""),0);
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Response.Release";
_response.Release();
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseError): job c";
anywheresoftware.b4a.keywords.Common.LogImpl("99764869","HttpUtils2Service (hc_ResponseError): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
if ((_response.getErrorResponse()).equals("") == false) { 
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_response.getErrorResponse());
 }else {
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
 };
RDebugUtils.currentLine=9764878;
 //BA.debugLineNum = 9764878;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "hc_responsesuccess", true))
	 {return ((String) Debug.delegate(ba, "hc_responsesuccess", new Object[] {_response,_taskid}));}
b4j.example.httpjob _job = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseSuccess): job";
anywheresoftware.b4a.keywords.Common.LogImpl("99633795","HttpUtils2Service (hc_ResponseSuccess): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="Dim out As OutputStream = File.OpenOutput(TempFol";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_tempfolder,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="job.Out = out";
_job._out /*anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper*/  = _out;
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="Response.GetAsynchronously(\"response\", out , _";
_response.GetAsynchronously(ba,"response",(java.io.OutputStream)(_out.getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "response_streamfinish", true))
	 {return ((String) Debug.delegate(ba, "response_streamfinish", new Object[] {_success,_taskid}));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_completejob(_taskid,_success,"");
 }else {
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_completejob(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "service_create", true))
	 {return ((String) Debug.delegate(ba, "service_create", null));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=9502732;
 //BA.debugLineNum = 9502732;BA.debugLine="TempFolder = File.DirTemp";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirTemp();
RDebugUtils.currentLine=9502734;
 //BA.debugLineNum = 9502734;BA.debugLine="If hc.IsInitialized = False Then";
if (_hc.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=9502739;
 //BA.debugLineNum = 9502739;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
 };
RDebugUtils.currentLine=9502747;
 //BA.debugLineNum = 9502747;BA.debugLine="TaskIdToJob.Initialize";
_taskidtojob.Initialize();
RDebugUtils.currentLine=9502749;
 //BA.debugLineNum = 9502749;BA.debugLine="End Sub";
return "";
}
public static String  _submitjob(b4j.example.httpjob _job) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "submitjob", true))
	 {return ((String) Debug.delegate(ba, "submitjob", new Object[] {_job}));}
int _taskid = 0;
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="If TaskIdToJob.IsInitialized = False Then Service";
if (_taskidtojob.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_service_create();};
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="taskCounter = taskCounter + 1";
_taskcounter = (int) (_taskcounter+1);
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="Dim TaskId As Int = taskCounter";
_taskid = _taskcounter;
RDebugUtils.currentLine=9568264;
 //BA.debugLineNum = 9568264;BA.debugLine="TaskIdToJob.Put(TaskId, job)";
_taskidtojob.Put((Object)(_taskid),(Object)(_job));
RDebugUtils.currentLine=9568265;
 //BA.debugLineNum = 9568265;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._username /*String*/ ).equals("") == false && (_job._password /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=9568266;
 //BA.debugLineNum = 9568266;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, TaskId, jo";
_hc.ExecuteCredentials(ba,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid,_job._username /*String*/ ,_job._password /*String*/ );
 }else {
RDebugUtils.currentLine=9568268;
 //BA.debugLineNum = 9568268;BA.debugLine="hc.Execute(job.GetRequest, TaskId)";
_hc.Execute(ba,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid);
 };
RDebugUtils.currentLine=9568270;
 //BA.debugLineNum = 9568270;BA.debugLine="End Sub";
return "";
}
}