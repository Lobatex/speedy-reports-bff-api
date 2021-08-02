package com.speedy.reports.api.core.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.speedy.reports.api.core.port.inbound.TransactionInbound;
import com.speedy.reports.api.core.port.outbound.TransactionOutbound;

/**
 * @author Lobato
 *
 */
@Service
public class TransactionHandler implements TransactionInbound {

	@Autowired
	private TransactionOutbound transactionOutbound;
	
	@Override
	public List<?> getTransactions() {
		transactionOutbound.getReports();
		return null;
	}

}
