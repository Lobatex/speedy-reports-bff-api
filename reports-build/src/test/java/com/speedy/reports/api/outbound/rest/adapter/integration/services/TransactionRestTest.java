package com.speedy.reports.api.outbound.rest.adapter.integration.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.TransactionListPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.TransactionPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.TransactionsReportPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.TransactionListResponse;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.TransactionResponse;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.TransactionsReportResponse;

@SpringBootTest
class TransactionRestTest {

	@Autowired
	private TransactionRest transactionRestPort;
	
	@Test
	void testGetTransactionReportsIntegration() {
		TransactionsReportPayload payload = new TransactionsReportPayload();
		payload.setToDate("2015-07-01");
		payload.setFromDate("2015-10-01");
		payload.setMerchant(1);
		payload.setAcquirer(1);
		ResponseEntity<TransactionsReportResponse> response = transactionRestPort.getTransactionReportsIntegration(payload);
		assertEquals(response.getStatusCodeValue(), 200);
	}

	@Test
	void testGetTransactionIntegration() {
		TransactionPayload payload = new TransactionPayload();
		payload.setTransactionId("1-1444392550-1");
		ResponseEntity<TransactionResponse> response = transactionRestPort.getTransactionIntegration(payload);
		assertEquals(response.getStatusCodeValue(), 200);
	}

	@Test
	void testGetTransactionsByDate() {
		TransactionListPayload payload = new TransactionListPayload();
		payload.setToDate("2015-07-01");
		payload.setFromDate("2015-10-01");
		ResponseEntity<TransactionListResponse> response = transactionRestPort.getTransactionListIntegration(payload);
		assertEquals(response.getStatusCodeValue(), 200);
	}
	
	@Test
	void testGetTransactionsByDateAndMerchantAndAcquirer() {
		TransactionListPayload payload = new TransactionListPayload();
		payload.setToDate("2015-07-01");
		payload.setFromDate("2015-10-01");
		payload.setAcquirer(1);
		payload.setMerchant(1);
		ResponseEntity<TransactionListResponse> response = transactionRestPort.getTransactionListIntegration(payload);
		assertEquals(response.getStatusCodeValue(), 200);
	}

}
