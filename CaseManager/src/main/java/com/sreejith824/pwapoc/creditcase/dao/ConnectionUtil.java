package com.sreejith824.pwapoc.creditcase.dao;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

public class ConnectionUtil {
	
	public static AmazonDynamoDB getDynamoDBConnection() {
		return AmazonDynamoDBClientBuilder.standard()
                .withRegion(Regions.EU_NORTH_1)
                .build();
	}

}
