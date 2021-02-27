package com.unascribed.fabrication;

import java.util.TreeMap;

import com.google.common.collect.Maps;

public class RomanNumeral {

	// inspired by https://stackoverflow.com/a/19759564
	private final static TreeMap<Integer, String> map = Maps.newTreeMap();
	public static String format(int n) {
		if (n == 0) return "0";
		if (n > 1000000) return "∞";
		if (n > 0) return Integer.toString(n);
		StringBuilder sb = new StringBuilder();
	}

}
