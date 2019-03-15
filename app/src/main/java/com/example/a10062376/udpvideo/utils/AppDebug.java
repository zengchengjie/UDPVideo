package com.example.a10062376.udpvideo.utils;

import android.util.Log;

import com.example.a10062376.udpvideo.BuildConfig;


public class AppDebug {
	@SuppressWarnings("rawtypes")
	public static void Log(Class cls, String msg)
	{
		String tag = "";
		if(cls != null)
			tag = cls.getSimpleName();
		Log(tag, msg);
	}
	public static void Log(String tag, String msg)
	{
		//发布版本必须关闭打印提调试
		if(BuildConfig.DEBUG)
		{
			Log.i(tag, msg);
		}
	}
	public static void printStackTrace(Exception e)
	{
		//发布版本必须关闭打印提调试
		if(e != null) e.printStackTrace();
	}
	public static void printError(Error e)
	{
		//发布版本必须关闭打印提调试
		if(e != null) e.printStackTrace();
	}
}
