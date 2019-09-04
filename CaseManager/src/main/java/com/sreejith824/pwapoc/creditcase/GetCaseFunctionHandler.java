package com.sreejith824.pwapoc.creditcase;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.model.DescribeTableResult;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.sreejith824.pwapoc.creditcase.domain.CaseDetails;
import com.sreejith824.pwapoc.creditcase.domain.CaseRequest;
import com.sreejith824.pwapoc.creditcase.domain.CaseResponse;

public class GetCaseFunctionHandler implements RequestHandler<CaseRequest, CaseResponse> {
	
	@Override
	public CaseResponse handleRequest(CaseRequest input, Context context) {
		// TODO Auto-generated method stub
		
		AmazonDynamoDBClientBuilder.standard();
		AmazonDynamoDB ddb = AmazonDynamoDBClientBuilder.standard()
                .withRegion(Regions.EU_NORTH_1)
                .build();
		DescribeTableResult describeTableResult = ddb.describeTable("case_data");
		
		System.out.println("GetCaseFunctionHandler");
		CaseDetails caseDetails = new CaseDetails();
		caseDetails.setUserId(describeTableResult.getTable().getTableArn());
		CaseResponse caseResponse = new CaseResponse();
		caseResponse.setCaseDetails(caseDetails);
		
		return caseResponse;
	}

}
