package com.ibm.pagingandsorting.dto;

//import lombok.Data;

//@Data
public class APIResponse<T> {

    int recordCount;
    T response;
	public APIResponse(int recordCount, T response) {
		super();
		this.recordCount = recordCount;
		this.response = response;
	}

}