package com.helloOne.sys.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	
	public static String createDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}

}
