package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.mapper.SalaryMapper;
import com.example.app.model.SalaryModel;

@Service
public class SalaryServiceImpl implements SalaryService{
    
    @Autowired
    private SalaryMapper salaryMapper;

    public List<SalaryModel> getSalary() throws Exception {
        return salaryMapper.getSalary();
    }
}
