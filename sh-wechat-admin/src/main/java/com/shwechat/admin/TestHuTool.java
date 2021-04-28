package com.shwechat.admin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestHuTool {

	public static void main(String[] args) {

	}
	
//	public static String getPrevMonthEndDay() {
//		Date date2 = DateUtil.date();
//		Calendar c = Calendar.getInstance();
//		DateUtil.lastMonth();
//		return null;
//	}
	
    public static String getPrevMonthEndDay() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = new Date();
			Calendar c = Calendar.getInstance();
			// 设置为指定日期
			c.setTime(date);
			// 指定日期月份减去一
			c.add(Calendar.MONTH, -1);
			// 指定日期月份减去一后的 最大天数
			c.set(Calendar.DATE, c.getActualMaximum(Calendar.DATE));
			// 获取最终的时间
			Date lastDateOfPrevMonth = c.getTime();
			return sdf.format(lastDateOfPrevMonth);
		} catch (Exception e) {
			return null;
		}
	}
}
