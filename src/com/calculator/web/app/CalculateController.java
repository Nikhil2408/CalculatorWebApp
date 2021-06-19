package com.calculator.web.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculateController 
{
	
	@RequestMapping(value="/processRequest", params="add")
	public String addTwoNumbers(HttpServletRequest request, Model model) 
	{
		int firstNumber=Integer.parseInt(request.getParameter("firstNumber"));
		int secondNumber=Integer.parseInt(request.getParameter("secondNumber"));
		
		int result=firstNumber+secondNumber;
		model.addAttribute("result", result);
		return "calculatorPage";
	}
	
	@RequestMapping(value="/processRequest", params="subtract")
	public String subtractTwoNumbers(HttpServletRequest request, Model model) 
	{
		int firstNumber=Integer.parseInt(request.getParameter("firstNumber"));
		int secondNumber=Integer.parseInt(request.getParameter("secondNumber"));
		
		int result=firstNumber-secondNumber;
		model.addAttribute("result", result);
		return "calculatorPage";
	}
	
	@RequestMapping(value="/processRequest", params="divide")
	public String divideTwoNumbers(HttpServletRequest request, Model model) 
	{
		int firstNumber=Integer.parseInt(request.getParameter("firstNumber"));
		int secondNumber=Integer.parseInt(request.getParameter("secondNumber"));
		
		int result=firstNumber/secondNumber;
		model.addAttribute("result", result);
		return "calculatorPage";
	}
	
	@RequestMapping(value="/processRequest", params="multiply")
	public String multiplyTwoNumbers(HttpServletRequest request, Model model) 
	{
		int firstNumber=Integer.parseInt(request.getParameter("firstNumber"));
		int secondNumber=Integer.parseInt(request.getParameter("secondNumber"));
		
		int result=firstNumber*secondNumber;
		model.addAttribute("result", result);
		return "calculatorPage";
	}
}
