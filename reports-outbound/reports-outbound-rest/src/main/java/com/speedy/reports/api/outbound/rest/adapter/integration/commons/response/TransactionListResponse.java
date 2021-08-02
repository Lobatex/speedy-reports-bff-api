/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration.commons.response;

import java.util.List;

import lombok.Data;

/**
 * @author Lobato
 *
 */
@Data
public class TransactionListResponse {
	
	private int per_page;
	private int current_page;
	private String next_page_url;
	private String previous_page_url;
	private int from;
	private int to;
	private List<TransactionsList> data;
	private Ipn ipn;
	private Transaction transaction;
	private Acquirer acquirer;
	private boolean refundable;
}
