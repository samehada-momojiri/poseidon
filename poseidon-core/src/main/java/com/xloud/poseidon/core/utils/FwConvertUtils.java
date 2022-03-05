package com.xloud.poseidon.core.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;

import com.xloud.poseidon.core.utils.converter.FwDateTimeConverter;
import com.xloud.poseidon.core.utils.converter.FwStringConverter;

public class FwConvertUtils {

	private static final BeanUtilsBean BUB;
	static {
		BUB = new BeanUtilsBean(new ConvertUtilsBean(), BeanUtilsBean.getInstance().getPropertyUtils());
		BUB.getConvertUtils().register(new FwStringConverter(), String.class);
		BUB.getConvertUtils().register(new FwDateTimeConverter(), Date.class);
	}

	private FwConvertUtils() {
		throw new IllegalStateException();
	}

	public static void copyProperties(Object dest, Object orig) {
		try {
			BUB.copyProperties(dest, orig);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
