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
public class TransactionsList {

	private FxTransactionResponse fx;
	private Customer customerInfo;
	private Merchant merchant;
	
}
