package com.guilhermeoscp.questao5.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtil {
	public String formatLocalDateTimeDatabaseStyle(LocalDateTime localDateTime) {
		return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(localDateTime);
	}
}
