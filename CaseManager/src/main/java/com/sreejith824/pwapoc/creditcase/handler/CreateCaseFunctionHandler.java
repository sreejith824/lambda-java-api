package com.sreejith824.pwapoc.creditcase.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.sreejith824.pwapoc.creditcase.domain.CreateCaseRequest;
import com.sreejith824.pwapoc.creditcase.domain.CreateCaseResponse;

public class CreateCaseFunctionHandler implements RequestHandler<CreateCaseRequest, CreateCaseResponse> {



	@Override
	public CreateCaseResponse handleRequest(CreateCaseRequest caseRequest, Context context) {
		// TODO Auto-generated method stub
		return new CreateCaseResponse();
	}

}
