/**
 * 
 */
package com.speedy.reports.api.inbound.rest.adapter.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.speedy.reports.api.core.port.inbound.TransactionInbound;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

/**
 * @author Lobato
 *
 */
@Api(value = "Resources for manage transactions",
	 consumes = "application/json", 
	 produces = "application/json")
@RestController
@RequestMapping("/transaction")
public class TransactionResources {

	@Autowired
	private TransactionInbound transactionService;
	
	@GetMapping
	@ApiOperation(value = "Get all transactions")
	@ApiResponse(code = 200, message = "OK", response = ArrayList.class)
	public ResponseEntity<List<?>> getAllTransactions(){
		List<?> transactions = transactionService.getTransactions();
		HttpStatus statusCode = transactions.isEmpty() ? HttpStatus.BAD_REQUEST : HttpStatus.OK;
		return new ResponseEntity<List<?>>(transactions, statusCode);
	}
	
}
