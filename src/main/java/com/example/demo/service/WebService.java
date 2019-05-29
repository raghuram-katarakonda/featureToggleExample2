package com.example.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(
	       name = "feature.toggles.productsFromWebService",
	       havingValue = "true"
	)
public class WebService implements Product{

	@Override
	public String getProductInfo() {
		// TODO Auto-generated method stub
		return "Product from web service";
	}

}
