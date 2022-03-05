package com.xloud.poseidon.core.utils.converter;

import java.util.Date;

import org.apache.commons.beanutils.converters.DateTimeConverter;

import com.xloud.poseidon.core.utils.FwDateUtils;

public class FwDateTimeConverter extends DateTimeConverter {

	@Override
	protected Class<?> getDefaultType() {
		return Date.class;
	}

	@Override
	public <T> T convert(Class<T> type, Object value) {
		if (value != null && value instanceof java.lang.String) {
			return type.cast(FwDateUtils.parse((String) value));
		} else {
			return super.convert(type, value);
		}
	}

}
