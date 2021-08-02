/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.LoginPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.LoginResponse;

/**
 * @author Lobato
 *
 */
@SpringBootTest
class LoginRestTest {

	@Autowired
	private LoginRest loginRestPort;
	
	@Test
	void testPostLogin() {
		LoginPayload payload = new LoginPayload();
		payload.setEmail("demo@financialhouse.io");
		payload.setPassword("cjaiU8CV");
		ResponseEntity<LoginResponse> postLogin = loginRestPort.postLogin(payload);
		assertEquals(postLogin.getStatusCodeValue(), 200);
	}

}
