package com.sreejith824.pwapoc.creditcase.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "caseData")
public class CaseDetails {
	
	@DynamoDBHashKey(attributeName = "id")
    private String id;
	
	@DynamoDBAttribute(attributeName = "userId")
    private String userId;
	
	@DynamoDBAttribute(attributeName = "caseTimestamp")
    private String caseTimestamp;
	
	@DynamoDBAttribute(attributeName = "caseDescription")
    private String caseDescription;
    
    public CaseDetails() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCaseTimestamp() {
		return caseTimestamp;
	}

	public void setCaseTimestamp(String caseTimestamp) {
		this.caseTimestamp = caseTimestamp;
	}

	public String getCaseDescription() {
		return caseDescription;
	}

	public void setCaseDescription(String caseDescription) {
		this.caseDescription = caseDescription;
	}

    
    
   }
