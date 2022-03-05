package com.xloud.poseidon.core.exception;

import java.util.List;

import com.google.common.collect.Lists;
import com.xloud.poseidon.core.dto.ErrorMessageDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FwBusinessException extends Exception {

	private static final long serialVersionUID = 8693467754042779368L;

	private List<ErrorMessageDto> errors = Lists.newArrayList();
	private Throwable cause;

	public FwBusinessException(String errorCode, String errorMessage) {
		this.errors = Lists.newArrayList(new ErrorMessageDto(errorCode, errorMessage));
	}
}
