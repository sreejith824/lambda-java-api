package com.sreejith824.pwapoc.creditcase.domain;

public class CaseDetails {
	
    private String id;
    private CreditCase creditCase;
    private String userId;
    public CaseDetails() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public CreditCase getCreditCase() {
		return creditCase;
	}
	public void setCreditCase(CreditCase creditCase) {
		this.creditCase = creditCase;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
    
    

}
