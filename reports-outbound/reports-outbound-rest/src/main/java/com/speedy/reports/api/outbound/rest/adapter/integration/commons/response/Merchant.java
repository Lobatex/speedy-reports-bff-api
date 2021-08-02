/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration.commons.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * @author Lobato
 *
 */
@Data
@JsonInclude(Include.NON_NULL)
public class Merchant {

	private long id;
	private String name;
	private int originalAmount;
	private String originalCurency;
	
}
