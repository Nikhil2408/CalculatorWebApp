package com.calculator.web.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String showMainPage()
	{
		return "homePage";
	}
	
	@RequestMapping("/showCalculator")
	public String showCalculatorPage()
	{
		return "calculatorPage";
	}
}
