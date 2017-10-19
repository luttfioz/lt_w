package com.lt.web.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;


public class HomeControllerTest {

	@InjectMocks
	HomeController hc;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void listTest(){
		assertNotNull(hc.list());
	}
}
