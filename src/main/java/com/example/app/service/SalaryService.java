package com.example.app.service;

import java.util.List;

import com.example.app.model.SalaryModel;

public interface SalaryService {
	public List<SalaryModel> getSalary() throws Exception;
}