package com.xloud.poseidon.service.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xloud.poseidon.core.utils.FwDateUtils;

@RestController
public class SampleController {
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String doHello() {
		return "Hello,World!" + FwDateUtils.getThreadDateTime();
	}

}
