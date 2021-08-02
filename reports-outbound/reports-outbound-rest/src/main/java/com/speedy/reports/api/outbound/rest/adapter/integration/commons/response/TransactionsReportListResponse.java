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
public class TransactionsReportListResponse {

	private int count;
	private int total;
	private String currency;
}
