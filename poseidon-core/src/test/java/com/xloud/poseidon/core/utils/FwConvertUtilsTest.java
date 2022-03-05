package com.xloud.poseidon.core.utils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lombok.Data;

public class FwConvertUtilsTest {

	@Test
	void test01() throws Exception {
		StringDto srcDto = new StringDto();
		srcDto.setStr("hello");
		srcDto.setInteger("100");
		srcDto.setDate("2021-02-03");
		srcDto.setBigDecimal("123");

		MultiTypeDto destDto = new MultiTypeDto();
		FwConvertUtils.copyProperties(destDto, srcDto);

		Assertions.assertEquals("hello", destDto.getStr());
		Assertions.assertEquals(100, destDto.getInteger());
		Assertions.assertEquals(new SimpleDateFormat("yyyy-MM-dd").parse("2021-02-03"), destDto.getDate());
		Assertions.assertEquals(new BigDecimal("123"), destDto.getBigDecimal());
	}

	@Test
	void test02() throws Exception {
		StringDto srcDto = new StringDto();

		MultiTypeDto destDto = new MultiTypeDto();
		FwConvertUtils.copyProperties(destDto, srcDto);

		Assertions.assertNull(destDto.getStr());
		Assertions.assertNull(destDto.getInteger());
		Assertions.assertNull(destDto.getDate());
		Assertions.assertNull(destDto.getBigDecimal());
	}

	@Test
	void test03() throws Exception {
		MultiTypeDto srcDto = new MultiTypeDto();
		srcDto.setStr("hello");
		srcDto.setInteger(100);
		srcDto.setDate(new SimpleDateFormat("yyyy-MM-dd").parse("2021-02-03"));
		srcDto.setBigDecimal(new BigDecimal("123"));

		StringDto destDto = new StringDto();
		FwConvertUtils.copyProperties(destDto, srcDto);

		Assertions.assertEquals("hello", destDto.getStr());
		Assertions.assertEquals("100", destDto.getInteger());
		Assertions.assertEquals("2021-02-03", destDto.getDate());
		Assertions.assertEquals("123", destDto.getBigDecimal());
	}

	@Test
	void test04() throws Exception {
		MultiTypeDto srcDto = new MultiTypeDto();

		StringDto destDto = new StringDto();
		FwConvertUtils.copyProperties(destDto, srcDto);

		Assertions.assertNull(destDto.getStr());
		Assertions.assertNull(destDto.getInteger());
		Assertions.assertNull(destDto.getDate());
		Assertions.assertNull(destDto.getBigDecimal());
	}

	@Data
	public class StringDto {
		private String str;
		private String integer;
		private String date;
		private String bigDecimal;
	}

	@Data
	public class MultiTypeDto {
		private String str;
		private Integer integer;
		private Date date;
		private BigDecimal bigDecimal;
	}

}
