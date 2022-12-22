package co.simplon.test.service;

import org.springframework.stereotype.Component;

import co.simplon.test.model.Test;

@Component
public class BusinessService {

	public Test getTest() {
		Test tt = new Test();
		return tt;
	}
	
}
