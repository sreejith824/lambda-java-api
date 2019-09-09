package com.sreejith824.pwapoc.creditcase.handler;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.util.StringUtils;
import com.sreejith824.pwapoc.creditcase.dao.ConnectionUtil;
import com.sreejith824.pwapoc.creditcase.domain.CaseDetails;
import com.sreejith824.pwapoc.creditcase.domain.GetCaseRequest;
import com.sreejith824.pwapoc.creditcase.domain.GetCaseResponse;

public class GetCaseFunctionHandler implements RequestHandler<GetCaseRequest , GetCaseResponse> {
	
	@Override
	public GetCaseResponse handleRequest(GetCaseRequest getCaseRequest, Context context) {
		
		DynamoDBMapper dbMapper = new DynamoDBMapper(ConnectionUtil.getDynamoDBConnection());
		if (StringUtils.isNullOrEmpty(getCaseRequest.getCaseId().toString())) {
			return new GetCaseResponse(dbMapper.load(CaseDetails.class, "case123"));
		}
		return new GetCaseResponse(dbMapper.load(CaseDetails.class, getCaseRequest.getCaseId().toString()));
		
	}
	


}
