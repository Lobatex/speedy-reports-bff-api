/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration.commons.response;

import java.util.List;

import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.constants.StatusResponse;

import lombok.Data;

/**
 * @author Lobato
 *
 */
@Data
public class TransactionsReportResponse {

	private StatusResponse status;
	private List<TransactionsReportListResponse> response;
	
}
