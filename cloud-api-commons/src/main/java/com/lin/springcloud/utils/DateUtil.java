package com.lin.springcloud.utils;


import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DateUtil {

	private static final DateTimeFormatter YYYYMMDD_FORMATTER =
			DateTimeFormatter.ofPattern("yyyyMMdd");

	/**
	 * @param date
	 * @return string-yyyyMMdd
	 */
	public static String getStr8Date(Date date) {
		if (null == date) {
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String str = formatter.format(date);
		return str;
	}

	/**
	 * @param date
	 * @return string-YYYYmmDDhhMMss
	 */
	public static String getStr14Date(Date date) {
		if (null == date) {
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddhhmmss");
		return formatter.format(date);
	}

	/**
	 * @return YYYYmmDDhhMMss
	 */
	public static String getStr14Datetime() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddhhmmss");
		return formatter.format(new Date());
	}

	public static LocalDateTime getDatetimeByISOZone(String datetime){
		DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
		OffsetDateTime utcDateTime = OffsetDateTime.parse(datetime, formatter);

		// 转换为北京时间（UTC+8）
		ZoneId beijingZoneId = ZoneId.of("Asia/Shanghai");
		ZonedDateTime beijingDateTime = utcDateTime.atZoneSameInstant(beijingZoneId);
		// 转换为 LocalDateTime，去掉时区信息
		return beijingDateTime.toLocalDateTime();
	}

	public static LocalDate convertToLocalDate(String dateStr) {
		if (dateStr == null || dateStr.isEmpty()) {
			return null;
		}
		try {
			return LocalDate.parse(dateStr, YYYYMMDD_FORMATTER);
		} catch (DateTimeParseException e) {
			// 可以记录日志或抛出业务异常
			return null;
		}
	}

}
