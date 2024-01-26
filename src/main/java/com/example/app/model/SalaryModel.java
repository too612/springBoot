package com.example.app.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder @Data
public class SalaryModel {
	private int id;
	@NonNull @Builder.Default private String name = "NULL NAME";    // null을 허용하지 않는다. null일 경우 default값을 NULL NAME으로 한다.
	private String email;	
}