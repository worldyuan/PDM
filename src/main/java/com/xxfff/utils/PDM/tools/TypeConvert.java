/*******************************************************
 * @author LIZHITAO
 * @date 2013-8-22 下午02:42:09
 * @name TypeConvert.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package com.xxfff.utils.PDM.tools;

/**
 * @author LIZHITAO 
 * @action PDM中表的字段类型转换为java中的类型工具类
 */
public class TypeConvert {
	public static String getTypeString(String value) {
		if (value != null) {
			if (value.toUpperCase().contains("CHAR") || value.toUpperCase().contains("CLOB")) {
				return "String";
			}
			if (value.toUpperCase().contains("TEXT")) {
				return "String";
			}
			if (value.toUpperCase().contains("BOOL")) {
				return "Boolean";
			}
			if (value.toUpperCase().contains("TINYINT")) {
				return "Integer";
			}
			if (value.toUpperCase().contains("BIGINT")) {
				return "Long";
			}
			if (value.toUpperCase().contains("FLOAT")) {
				return "Float";
			}
			if (value.toUpperCase().contains("DOUBLE") || value.toUpperCase().matches("DECIMAL\\(\\d+,[1-9]\\)")
					|| value.toUpperCase().matches("NUMERIC\\(\\d+,[1-9]\\)")
					|| value.toUpperCase().matches("NUMBER\\(\\d+,[1-9]\\)")) {
				return "Double";
			}
			if (value.toUpperCase().contains("TIME") || value.toUpperCase().contains("DATE")) {
				return "Date";
			}
			if (value.toUpperCase().contains("BLOB") || value.toUpperCase().contains("BINARY")) {
				return "String";
			}
			// 放在最后
			if (!value.toUpperCase().matches("DECIMAL\\(\\d+,[1-9]\\)")
					&& !value.toUpperCase().matches("NUMERIC\\(\\d+,[1-9]\\)")
					&& !value.toUpperCase().matches("NUMBER\\(\\d+,[1-9]\\)")
					|| value.toUpperCase().contains("INT")
					|| value.toUpperCase().contains("YEAR")) {
				return "Integer";
			}
		}
		return "String";
	}
	
}
