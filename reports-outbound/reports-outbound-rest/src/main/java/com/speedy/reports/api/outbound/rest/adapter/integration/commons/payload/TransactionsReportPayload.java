/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * @author Lobato
 *
 */
@Data
@JsonInclude(Include.NON_DEFAULT)
public class TransactionsReportPayload {

	private String fromDate;
	private String toDate;
	private String paymentMethod;
	private long merchant;
	private long acquirer;
	
}
