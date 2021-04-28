package com.shwechat.core.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {

	/**
	 * 
	 * @Title: getPrevMonthEndDay
	 * @Description: 获取上个月的最后一天
	 * @return
	 * @author zhush
	 * @date 2021-04-19 05:19:40
	 */
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
