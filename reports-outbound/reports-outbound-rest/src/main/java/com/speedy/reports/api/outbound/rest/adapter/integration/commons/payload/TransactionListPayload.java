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
@JsonInclude(Include.NON_NULL)
public class TransactionListPayload {

	private String fromDate;
	private String toDate;
	private int merchant;
	private int acquirer;
	private String status;
	private String operation;
	private String paymentMethod;
	private String filterField;
	private String filterValue;
	private int page;
	private String errorCode;
}
