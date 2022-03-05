package com.xloud.poseidon.core.exception;

public class FwSystemException extends RuntimeException {

	private static final long serialVersionUID = 4434299475879036099L;

	public FwSystemException() {
		super();
	}

	public FwSystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public FwSystemException(String message) {
		super(message);
	}

	public FwSystemException(Throwable cause) {
		super(cause);
	}

}
