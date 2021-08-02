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
public class AgentTransactionMerchant {

	private long id;
	private String customerIp;
	private String customerAgent;
	private String merchantIp;
	
}
