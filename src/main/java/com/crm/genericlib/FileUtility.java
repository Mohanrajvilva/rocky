package com.crm.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getpropertydata(String key) throws Throwable
	{
		FileInputStream fs=new FileInputStream(AutoConstant.propertyfilepath);
		Properties p=new Properties();
		p.load(fs);
		return p.getProperty(key);
		
	}

}
