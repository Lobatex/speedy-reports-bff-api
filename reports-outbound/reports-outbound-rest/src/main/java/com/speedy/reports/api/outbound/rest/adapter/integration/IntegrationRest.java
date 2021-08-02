/**
 * 
 */
package com.speedy.reports.api.outbound.rest.adapter.integration;

import java.security.KeyManagementException;
import java.security.cert.X509Certificate;

import javax.annotation.PostConstruct;
import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.speedy.reports.api.outbound.rest.adapter.integration.commons.payload.LoginPayload;
import com.speedy.reports.api.outbound.rest.adapter.integration.commons.response.LoginResponse;
import com.speedy.reports.api.outbound.rest.adapter.integration.services.LoginRest;

import lombok.Data;

/**
 * @author Lobato
 *
 */
@Data
@Component
public class IntegrationRest {

	@Autowired
	protected LoginRest loginRest;
	
	@Value("${rest.integration.base.url}")
	private String baseUrl;
	
	@Value("${rest.integration.user}")
	private String user;
	@Value("${rest.integration.pass}")
	private String password;
	
	private String postLogin;
	private String getTransactionsReport;
	private String getTransactionsList;
	private String getTransaction;
	private String getClient;
	
	@PostConstruct
	public void loadEndpoints() {
		this.postLogin = baseUrl + "/merchant/user/login";
		this.getTransactionsReport = baseUrl + "/transactions/report";
		this.getTransactionsList = baseUrl + "/transaction/list";
		this.getTransaction = baseUrl + "/transaction";
		this.getClient = baseUrl + "/client";
	}
	
	protected String getToken() {
		LoginPayload login = new LoginPayload();
		login.setEmail(getUser());
		login.setPassword(getPassword());
		LoginResponse token = loginRest.postLogin(login).getBody();
		return token.getToken();
	}

	protected RestTemplate getIntegration() {
		RestTemplate template = null;
		TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
		SSLContext sslContext;
		try {
			sslContext = SSLContexts.custom().loadTrustMaterial(acceptingTrustStrategy).build();
			SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);
			CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
			HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();

			requestFactory.setHttpClient(httpClient);

			requestFactory.setConnectTimeout(15000);
			requestFactory.setReadTimeout(15000);
			requestFactory.setConnectionRequestTimeout(15000);
			template = new RestTemplate(requestFactory);
		} catch (KeyManagementException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return template;
	}
}
