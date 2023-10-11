package com.br.emailservice.infra.ses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceAsyncClientBuilder;

@Configuration
public class AwsSesConfig {
	
	@Bean
	public AmazonSimpleEmailService amazonSimpleEmailService() {
		return AmazonSimpleEmailServiceAsyncClientBuilder.standard().withRegion(Regions.US_EAST_2).build();
	}
	
}
