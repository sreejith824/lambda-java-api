package com.sreejith824.pwapoc.creditcase.handler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.util.StringUtils;
import com.sreejith824.pwapoc.creditcase.dao.ConnectionUtil;
import com.sreejith824.pwapoc.creditcase.domain.CaseDetails;
import com.sreejith824.pwapoc.creditcase.domain.GetCaseResponse;

public class GetCaseFunctionHandler implements RequestHandler<Map<String, Object> , GetCaseResponse> {
	
	@Override
	public GetCaseResponse handleRequest(Map<String, Object> getCaseRequest, Context context) {
		
		if (getCaseRequest!= null) {
			for ( Entry<String, Object> entry : getCaseRequest.entrySet()) {
				System.out.println("Get Inputkey : " + entry.getKey() + " &  value :  " + entry.getValue());;
			}
		}
		
		if (context!= null) {
			System.out.println("Context # Function name : " + context.getFunctionName());
		}
		
		
		getDate();
		DynamoDBMapper dbMapper = new DynamoDBMapper(ConnectionUtil.getDynamoDBConnection());
		if (StringUtils.isNullOrEmpty(getCaseRequest.get("caseId").toString())) {
			return new GetCaseResponse(dbMapper.load(CaseDetails.class, "case123"));
		}
		return new GetCaseResponse(dbMapper.load(CaseDetails.class, getCaseRequest.get("caseId").toString()));
		
	}
	
	private void getDate() {
        Date date = new Date();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        df.setTimeZone(tz);
        String date_time = df.format(date);
        Map<String, AttributeValue> values = new HashMap<String, AttributeValue>();
        values.put("date_time", new AttributeValue(date_time));
	}

}
