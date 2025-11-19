package org.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@GetMapping("/empForm")
	public String tiggerEmp() {
		return "employees.jsp";
	}
	
	@PostMapping("/empsave")
	public ModelAndView saveEmp(@ModelAttribute Employee employee) {
		
		ModelAndView view = new ModelAndView("empDisplay.jsp");
		return view;
	}
	
}
