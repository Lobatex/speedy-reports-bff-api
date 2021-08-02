/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload;

import lombok.Data;

/**
 * @author Lobato
 *
 */
@Data
public class TransactionsReportPayload {

	private String fromDate;
	private String toDate;
	private long merchant;
	private long acquirer;
	
}
