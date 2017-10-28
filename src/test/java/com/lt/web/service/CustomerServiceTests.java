package com.lt.web.service;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lt.web.MongoConfig;
import com.lt.web.domain.Customer;
import com.lt.web.domain.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MongoConfig.class)
public class CustomerServiceTests {

	@Mock
	private CustomerRepository repository;

    @InjectMocks
    CustomerService service;

    Customer dave, oliver, carter;

    @Before
    public void setUp() {
    }

    @Test
    @Ignore
    public void getCustomer() {

    		//mock ama given return kullanilmadıgi icin null gelir
        Customer dave = service.getCustomer();

        assertThat(dave).isNull();
    }
    
    @Test
    public void getCustomerMock() {
        
    		// RemoteService has been injected into the reverser bean
        given(this.repository.findByFirstName("Alice")).willReturn(new Customer("Ali","Veli"));
        Customer reverse = service.getCustomer();
        assertThat(reverse.firstName).isEqualTo("Ali");
    }


   
}
