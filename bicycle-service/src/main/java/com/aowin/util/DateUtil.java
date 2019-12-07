package com.aowin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * 返回当前时间
	 * @return
	 */
	public static String currentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}
	/**
	 * 当前时间加一个月
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	 public static String subMonth(String date) throws ParseException {  
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	        Date dt = sdf.parse(date);  
	        Calendar rightNow = Calendar.getInstance();  
	        rightNow.setTime(dt);  
	        rightNow.add(Calendar.MONTH, 1);  
	        Date dt1 = rightNow.getTime();  
	        String reStr = sdf.format(dt1);  
	        return reStr;  
	 }
	 /**
	  * 计算时间差
	  * @param a
	  * @param b
	  * @return
	  */
	 public static Long between_days(String a, String b) {

	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 自定义时间格式

	        Calendar calendar_a = Calendar.getInstance();// 获取日历对象
	        Calendar calendar_b = Calendar.getInstance();

	        Date date_a = null;
	        Date date_b = null;

	        try {
	            date_a = simpleDateFormat.parse(a);//字符串转Date
	            date_b = simpleDateFormat.parse(b);
	            calendar_a.setTime(date_a);// 设置日历
	            calendar_b.setTime(date_b);
	        } catch (ParseException e) {
	            e.printStackTrace();//格式化异常
	        }

	        long time_a = calendar_a.getTimeInMillis();
	        long time_b = calendar_b.getTimeInMillis();

	        long between_days = (time_a - time_b) / (1000 * 3600 * 24);//计算相差天数

	        return between_days;
	    }
}
