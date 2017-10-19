package com.lt.web.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@RunWith(SpringJUnit4ClassRunner.class)
public class HomeControllerWebIntegrationTests {

	@Ignore
	@Test
	public void testListAll() throws JsonProcessingException, IOException {
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8443/api/v1/name", String.class);
		
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode responseJson =mapper.readTree(response.getBody());
		
		assertThat(responseJson.isMissingNode(), is(false));
		assertThat(responseJson.toString(), equalTo("[]"));
		
	}

}
