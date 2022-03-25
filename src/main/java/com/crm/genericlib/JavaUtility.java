package com.crm.genericlib;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int getran()
	{
		Random ran=new Random();
		int rannum = ran.nextInt(1000);
		return rannum;
		
	}
	public String getcurrentdate()
	{
		Date d=new Date();
		String currentdate = d.toString();
		return currentdate;
	}
	public String getsystemdate()
	{
		Date d=new Date();
		String dat = d.toString();
		String[] str = dat.split(" ");
		String YYYY = str[5];
		String MM = str[2];
		String DD = str[1];
		String sysdate=DD+" "+MM+" "+YYYY;
		return sysdate;
	}

}
