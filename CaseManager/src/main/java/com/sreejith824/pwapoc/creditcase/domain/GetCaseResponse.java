package com.sreejith824.pwapoc.creditcase.domain;

public class GetCaseResponse {
	private CaseDetails caseDetails;
	
	public GetCaseResponse(CaseDetails caseDetails) {
		this.caseDetails = caseDetails;
		// TODO Auto-generated constructor stub
	}

	public CaseDetails getCaseDetails() {
		return caseDetails;
	}

	public void setCaseDetails(CaseDetails caseDetails) {
		this.caseDetails = caseDetails;
	}
	
	

}
