package com.xloud.poseidon.core.utils;

import java.util.Map;

import com.google.common.collect.Maps;

public class FwThreadLocalUtils {

	private FwThreadLocalUtils() {
	}

	private static final ThreadLocal<Map<String, Object>> POOL = new ThreadLocal<Map<String, Object>>() {
		@Override
		protected Map<String, Object> initialValue() {
			return Maps.newHashMap();
		}
	};

	public static Object set(String key, Object value) {
		return POOL.get().put(key, value);
	}

	public static <T> T get(String key, Class<T> clazz) {
		return clazz.cast(POOL.get().get(key));
	}

	public static void clear() {
		POOL.get().clear();
	}
}