/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.speedy.reports.api.outbound.rest.adapter.integration.IntegrationRest;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.ClientPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.Customer;

/**
 * @author Lobato
 *
 */
@Service
public class ClientRest extends IntegrationRest {
	
	public ResponseEntity<Customer> getClientIntegration(ClientPayload clientPayload) {
		// TODO: create singleton for token and verify if token need be refreshed
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", getToken());
		HttpEntity<ClientPayload> payload = new HttpEntity<>(clientPayload, headers);
		ResponseEntity<Customer> response = getIntegration().postForEntity(getGetClient(), payload, Customer.class);
		return response;
	}
	
}
