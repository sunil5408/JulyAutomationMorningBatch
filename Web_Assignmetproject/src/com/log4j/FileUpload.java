package com.log4j;

public class FileUpload {

	public static void main(String[] args) {
		try
		{
			Runtime.getRuntime().exec("C:\\AutoitexmplefileUpload\\fileupload_x64.exe");
			Runtime obj=Runtime.getRuntime();
			obj.exec("C:\\AutoitexmplefileUpload\\fileupload_x64.exe");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
