/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.ClientPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.Customer;

/**
 * @author Lobato
 *
 */
@SpringBootTest
public class ClientRestTest {
	
	@Autowired
	private ClientRest clientRestPort;
	
	@Test
	void testGetTransactionReportsIntegration() {
		ClientPayload payload = new ClientPayload();
		payload.setTransactionId("1-1444392550-1");
		ResponseEntity<Customer> response = clientRestPort.getClientIntegration(payload);
		assertEquals(response.getStatusCodeValue(), 200);
	}

}
