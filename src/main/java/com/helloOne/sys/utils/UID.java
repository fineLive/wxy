package com.helloOne.sys.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class UID {
	private static Date date = new Date();
	private static StringBuilder buf = new StringBuilder();
	private static int seq = 0;
	private static final int ROTATION = 99999;
	private static long num=0; 
	

	public static synchronized long next() {
		if (seq > ROTATION)
			seq = 0;
		buf.delete(0, buf.length());
		date.setTime(System.currentTimeMillis());
		String str = String.format("%1$tY%1$tm%1$td%1$tk%1$tM%1$tS%2$05d", date, seq++);
		return Long.parseLong(str);
	}
	@Test
	public void test(){
		System.out.println(next());
		
	}
	
	
	 public static synchronized long getLongId(){
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		    String date=sdf.format(new Date());
		    System.out.println("ԭʼid="+date);
		    if(num>=99) num=0l;
		    ++num;
		    if(num<10) {
		      date=date+00+num;
		    }else{
		      date+=num;
		    }
		    return Long.valueOf(date);
		  }
		   
	public static void main(String[] args) {
		System.out.println(getLongId());
	} 

}
