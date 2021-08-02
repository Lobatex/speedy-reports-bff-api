/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration.commons.response;

import lombok.Data;

/**
 * @author Lobato
 *
 */
@Data
public class TransactionMerchant {

	private String referenceNo;
	private long merchantId;
	private String status;
	private String channel;
	private String customData;
	private String chainId;
	private int agentInfoId;
	private String operation;
	private int fxTransactionId;
	private String updated_at;
	private String crated_at;
	private long id;
	private long acquirerTransactionId;
	private String code;
	private String message;
	private String transactionId;
	private AgentTransactionMerchant agent;
}
