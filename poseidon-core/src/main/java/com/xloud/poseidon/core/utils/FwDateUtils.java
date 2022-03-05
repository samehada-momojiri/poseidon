package com.xloud.poseidon.core.utils;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import com.xloud.poseidon.core.constant.FwConstant;

public class FwDateUtils {

	private static final String THREAD_LOCAL_KEY = "___THREAD_LOCAL_DATE___";

	public static void setThreadDateTime(final Date datetime) {
		FwThreadLocalUtils.set(THREAD_LOCAL_KEY, datetime);
	}

	public static Date getThreadDateTime() {
		return FwThreadLocalUtils.get(THREAD_LOCAL_KEY, Date.class);
	}

	public static Date getThreadDate() {
		return DateUtils.truncate(getThreadDateTime(), Calendar.DAY_OF_MONTH);
	}

	public static Date getSystemDateTime() {
		return new Date();
	}

	public static Date getSystemDate() {
		return DateUtils.truncate(getSystemDateTime(), Calendar.DAY_OF_MONTH);
	}

	public static String format(Date date, String pattern) {
		if (date == null) {
			return null;
		}
		return DateFormatUtils.format(date, pattern);
	}

	public static String formatDate(Date date) {
		return format(date, FwConstant.DATE_FORMAT_HYPHEN);
	}

	public static String formatDateTime(Date date) {
		return format(date, FwConstant.DATETIME_FORMAT_HYPHEN);
	}

	public static Date parse(String strDate) {

		try {
			return DateUtils.parseDateStrictly(strDate, FwConstant.DATE_FORMAT, FwConstant.DATE_FORMAT_HYPHEN,
					FwConstant.DATE_FORMAT_SLASH, FwConstant.DATETIME_FORMAT, FwConstant.DATETIME_FORMAT_HYPHEN,
					FwConstant.DATETIME_FORMAT_SLASH);
		} catch (Exception e) {
			return null;
		}
	}

}
