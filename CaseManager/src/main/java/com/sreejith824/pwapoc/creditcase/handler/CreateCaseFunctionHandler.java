package com.sreejith824.pwapoc.creditcase.handler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.sreejith824.pwapoc.creditcase.dao.ConnectionUtil;
import com.sreejith824.pwapoc.creditcase.domain.CreateCaseRequest;
import com.sreejith824.pwapoc.creditcase.domain.CreateCaseResponse;

public class CreateCaseFunctionHandler implements RequestHandler<CreateCaseRequest, CreateCaseResponse> {



	@Override
	public CreateCaseResponse handleRequest(CreateCaseRequest caseRequest, Context context) {
		// TODO Auto-generated method stub
		
		caseRequest.getCaseDetails().setCaseTimestamp(getDate());
		DynamoDBMapper dbMapper = new DynamoDBMapper(ConnectionUtil.getDynamoDBConnection());
		dbMapper.save(caseRequest.getCaseDetails());
		return new CreateCaseResponse( "Case Saved" );
	}
	
	private String getDate() {
        Date date = new Date();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        df.setTimeZone(tz);
        return df.format(date);
        
	}

}
