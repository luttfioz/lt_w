package com.lt.web.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.lt.web.MongoConfig;
import com.lt.web.domain.Customer;
import com.lt.web.service.CustomerService;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MongoConfig.class)
public class CustomerControllerTest {

	@Mock
	CustomerService customerService;
	
	@InjectMocks
	CustomerController customerController;
	/*
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	*/
	@Test
	public void listTest(){
		
		Mockito.when(this.customerService.getCustomer()).thenReturn(new Customer("Ali","Veli"));
        Customer reverse = customerController.getCustomer();
        assertThat(reverse.firstName).isEqualTo("Ali");
	}
}
