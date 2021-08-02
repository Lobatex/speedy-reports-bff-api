package com.speedy.reports.api.outbound.rest.adapter.integration.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.speedy.reports.api.outbound.rest.adapter.integration.IntegrationRest;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.TransactionListPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.TransactionPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.TransactionsReportPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.TransactionListResponse;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.TransactionResponse;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.TransactionsReportResponse;

@Service
public class TransactionRest extends IntegrationRest {


	public ResponseEntity<TransactionsReportResponse> getTransactionReportsIntegration(TransactionsReportPayload transactionPayload) {
		//TODO: create singleton for token and verify if token need be refreshed
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer "+ getToken());
		HttpEntity<TransactionsReportPayload> payload = new HttpEntity<>(transactionPayload, headers);
		ResponseEntity<TransactionsReportResponse> response = getIntegration().postForEntity(getGetTransactionsReport(), payload, TransactionsReportResponse.class);
		return response;
	}
	
	public ResponseEntity<TransactionResponse> getTransactionIntegration(TransactionPayload transactionPayload) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer "+ getToken());
		HttpEntity<TransactionPayload> payload = new HttpEntity<>(transactionPayload, headers);
		ResponseEntity<TransactionResponse> response = getIntegration().postForEntity(getGetTransactionsList(), payload, TransactionResponse.class);
		return response;
	}
	
	public ResponseEntity<TransactionListResponse> getTransactionListIntegration(TransactionListPayload transactionPayload) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer "+ getToken());
		HttpEntity<TransactionListPayload> payload = new HttpEntity<>(transactionPayload, headers);
		ResponseEntity<TransactionListResponse> response = getIntegration().postForEntity(getGetTransactionsList(), payload, TransactionListResponse.class);
		return response;
	}
}
