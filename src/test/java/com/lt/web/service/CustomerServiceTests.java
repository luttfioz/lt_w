package com.lt.web.service;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lt.web.domain.Customer;
import com.lt.web.domain.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerServiceTests {

	@MockBean
	private CustomerRepository repository;

    @Autowired
    CustomerService service;

    Customer dave, oliver, carter;

    @Before
    public void setUp() {

        service.getCustomer();
    }

    @Test
    public void getCustomer() {

        Customer dave = service.getCustomer();

        assertThat(dave.id).isNotNull();
    }
    
    @Test
    public void getCustomerMock() {
        
    		// RemoteService has been injected into the reverser bean
        given(this.repository.findByFirstName("Alice")).willReturn(new Customer("Ali","Veli"));
        Customer reverse = service.getCustomer();
        assertThat(reverse).isEqualTo("kcom");
    }


   
}
