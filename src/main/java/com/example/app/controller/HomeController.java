package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.app.model.SalaryModel;
import com.example.app.service.SalaryService;

import jakarta.servlet.http.HttpServletRequest;
    
@Controller
public class HomeController {
	
    @Autowired
	SalaryService salaryService;

    @RequestMapping(value = "/home", method=RequestMethod.GET)
	public ModelAndView goHome(HttpServletRequest request) throws Exception{
		ModelAndView mav = new ModelAndView();

        // DB 방식
		List<SalaryModel> salaryList = salaryService.getSalary();

		/*
        // builder 방식

        //salary 객체 리스트 변수
		List<SalaryModel> salaryList = new ArrayList<SalaryModel>();

		// salaryModle
		SalaryModel salaryModel;

        // 첫 번째 데이터
		salaryModel = SalaryModel.builder()
                .id(1)
                .name("AAA")
                .email("AAA@example.com").build();
        salaryList.add(salaryModel);


        // 두 번째 데이터
        salaryModel = SalaryModel.builder()
                .id(2)
                .name("BBB")
                .email("BBB@example.com").build();
        salaryList.add(salaryModel);


        // 세 번째 데이터
        salaryModel = SalaryModel.builder()
                .id(3)
                .name("CCC")
                .email("CCC@example.com").build();
        salaryList.add(salaryModel);
         */

		/** getter setter 방식
		
        //salary 객체 리스트 변수
		List<SalaryModel> salaryList = new ArrayList<SalaryModel>();
        

		//Salary model
		SalaryModel salaryModel = new SalaryModel();

        // 첫 번째 데이터
		salaryModel = new SalaryModel();
		salaryModel.setId(1);
		salaryModel.setName("AAA");
		salaryModel.setEmail("AAA@example.com");		
		salaryList.add(salaryModel);
		
		
		// 두 번째 데이터
		salaryModel = new SalaryModel();
		salaryModel.setId(2);
		salaryModel.setName("BBB");
		salaryModel.setEmail("BBB@example.com");
		salaryList.add(salaryModel);

		
		// 세 번째 데이터
		salaryModel = new SalaryModel();
		salaryModel.setId(3);
		salaryModel.setName("CCC");
		salaryModel.setEmail("CCC@example.com");
		salaryList.add(salaryModel);
		 */
		
		mav.addObject("salaryList",salaryList);
		mav.setViewName("content/home");
		
		return mav;
	}
}