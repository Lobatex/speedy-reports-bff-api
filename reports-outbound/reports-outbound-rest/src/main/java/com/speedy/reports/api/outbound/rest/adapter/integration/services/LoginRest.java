/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.speedy.reports.api.outbound.rest.adapter.integration.IntegrationRest;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.LoginPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.LoginResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Lobato
 *
 */
@Service
@Slf4j
public class LoginRest extends IntegrationRest {

	public ResponseEntity<LoginResponse> postLogin(LoginPayload login) {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<LoginPayload> payload = new HttpEntity<>(login, headers);
		ResponseEntity<LoginResponse> response = getIntegration().postForEntity(getPostLogin(), payload, LoginResponse.class);
		this.checkResponseStatus(response);
		return response;
	}

	private void checkResponseStatus(ResponseEntity<LoginResponse> response) {
		HttpStatus statusCode = response.getStatusCode();
		switch (statusCode) {
		case UNAUTHORIZED:
			//TODO: Throw business exception
			log.info("Session unauthorized check credentials;");
			break;
		default:
			break;
		}
	}
	
}
