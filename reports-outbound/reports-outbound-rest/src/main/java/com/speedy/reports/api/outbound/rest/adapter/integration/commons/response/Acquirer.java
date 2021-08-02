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
public class Acquirer {

	private int id;
	private String name;
	private String code;
	private String type;
	
}
