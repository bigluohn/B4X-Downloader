package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class b4xcollections extends Object{
public static b4xcollections mostCurrent = new b4xcollections();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xcollections", null);
		ba.loadHtSubs(b4xcollections.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.b4xcollections", ba);
		}
	}
    public static Class<?> getObject() {
		return b4xcollections.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.b4xbitset  _createbitset(int _size) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createbitset", true))
	 {return ((b4j.example.b4xbitset) Debug.delegate(ba, "createbitset", new Object[] {_size}));}
b4j.example.b4xbitset _s = null;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim s As B4XBitSet";
_s = new b4j.example.b4xbitset();
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,ba,_size);
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xorderedmap  _createorderedmap() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap", true))
	 {return ((b4j.example.b4xorderedmap) Debug.delegate(ba, "createorderedmap", null));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap2", true))
	 {return ((b4j.example.b4xorderedmap) Debug.delegate(ba, "createorderedmap2", new Object[] {_keys,_values}));}
b4j.example.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xset  _createset() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset", true))
	 {return ((b4j.example.b4xset) Debug.delegate(ba, "createset", null));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xset  _createset2(anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset2", true))
	 {return ((b4j.example.b4xset) Debug.delegate(ba, "createset2", new Object[] {_values}));}
b4j.example.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Dim s As B4XSet";
_s = new b4j.example.b4xset();
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="End Sub";
return null;
}
}