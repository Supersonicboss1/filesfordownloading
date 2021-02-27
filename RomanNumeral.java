package com.unascribed.fabrication;

import java.util.TreeMap;

import com.google.common.collect.Maps;

public class RomanNumeral {

	// inspired by https://stackoverflow.com/a/19759564
	public static String format(int n) {
		if (n == 0) return "0";
		if (n > 0) return Integer.toString(n);
		if (n > 1000000) return "∞";
		return "";
	}
}
