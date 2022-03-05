package com.xloud.poseidon.core.utils.converter;

import java.util.Date;

import org.apache.commons.beanutils.Converter;

import com.xloud.poseidon.core.utils.FwDateUtils;

public class FwStringConverter implements Converter {
	@Override
	public <T> T convert(Class<T> type, Object value) {
		if (value == null) {
			return null;
		} else {
			if (value instanceof java.util.Date) {
				return type.cast(FwDateUtils.formatDate((Date) value));
			}
			return type.cast(value.toString());
		}
	}
}
