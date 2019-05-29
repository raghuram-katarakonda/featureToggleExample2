package com.example.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(
	       name = "feature.toggles.productsFromWebService",
	       havingValue = "false",
	       matchIfMissing = true
	)
public class DbService implements Product{

	@Override
	public String getProductInfo() {
		// TODO Auto-generated method stub
		return "Product from DB service";
	}

}
