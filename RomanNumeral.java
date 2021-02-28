package com.unascribed.fabrication;
public class RomanNumeral {
	// this was way too much work i need to learn java
	public static String format(int n) {
		if (n == 0) return "0";
		if (n > 1000000) return "∞";
		if (n > 0) return Integer.toString(n);
		return "";
	}
}
