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
public class Customer {

	private long id;
	private String created_at;
	private String updated_at;
	private String deleted_at;
	private String number;
	private String expiryMonth;
	private String expiryYear;
	private String startMonth;
	private String startYear;
	private String email;
	private String birthday;
	private String gender;
	private String billingTitle;
	private String billingFirstName;
	private String billingLastName;
	private String billingCompany;
	private String billingAddress1;
	private String billingAddress2;
	private String billingCity;
	private String billingPostCode;
	private String billingState;
	private String billingCountry;
	private String billingPhone;
	private String billingFax;
	private String shippingTitle;
	private String shippingFistName;
	private String shippingCompany;
	private String shippingAddress1;
	private String shippingAddress2;
	private String shippingCity;
	private String shippingPostCode;
	private String shippingState;
	private String shippingCountry;
	private String shippingPhone;
	private String shippingFax;
	
}
