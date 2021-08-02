package com.speedy.reports.api.outbound.rest.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.speedy.reports.api.core.port.outbound.TransactionOutbound;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.TransactionsReportPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.TransactionsReportResponse;
import com.speedy.reports.api.outbound.rest.adapter.integration.services.TransactionRest;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Lobato
 *
 */
@Service
@Slf4j
public class TransactionsAdapter implements TransactionOutbound {

	@Autowired
	private TransactionRest transactionRest;
	
	
	@Override
	public void getReports() {
		TransactionsReportPayload payload = new TransactionsReportPayload();
		payload.setToDate("2019-07-01");
		payload.setFromDate("2021-10-01");
		payload.setMerchant(1);
		payload.setAcquirer(1);
		ResponseEntity<TransactionsReportResponse> responseIntegration = transactionRest.getTransactionReportsIntegration(payload);
		//TODO: add DTO for core module and serialize it for return
	}

	
}
