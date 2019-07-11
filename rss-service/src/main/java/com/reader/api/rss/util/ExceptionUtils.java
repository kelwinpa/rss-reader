package com.reader.api.rss.util;

public class ExceptionUtils {

	public static final int CONVERT_XML_TO_OBJECT = 800;

	public static String getMessage(int errorCode) {
		switch (errorCode) {
		case CONVERT_XML_TO_OBJECT:
			return "Error: no possible to convert xml to object";
		default:
			return "Error";
		}
	}

}
