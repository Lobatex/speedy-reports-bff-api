/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration.commons.response;

import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.constants.StatusResponse;

import lombok.Data;

/**
 * @author Lobato
 *
 */
@Data
public class LoginResponse {

	private String token;
	private StatusResponse status;
	
}
