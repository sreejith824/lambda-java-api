package com.sreejith824.pwapoc.creditcase;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.sreejith824.pwapoc.creditcase.domain.CaseRequest;
import com.sreejith824.pwapoc.creditcase.domain.CaseResponse;

public class CreateCaseFunctionHandler implements RequestHandler<CaseRequest, CaseResponse> {



	@Override
	public CaseResponse handleRequest(CaseRequest input, Context context) {
		// TODO Auto-generated method stub
		return new CaseResponse();
	}

}
