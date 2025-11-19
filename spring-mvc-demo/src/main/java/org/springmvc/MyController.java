package org.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@GetMapping("/home")
	public String homePage() {
		return "home.jsp";
	}
	
	@GetMapping("/login")
	public String LoginPage(){
		return "User.jsp";
	}

	@GetMapping("/student")
	public String StudentInfo(Model model) {
		model.addAttribute("sid", "101");
		model.addAttribute("sname", "Riya Jogi");
		model.addAttribute("sage", "21");
		return "student.jsp";
	}
	
	@GetMapping("/employee")
	public String getEmployeeInfo(ModelMap map) {
		map.put("ename", "shruti");
		map.addAttribute("esal", "60000");
		return "employee.jsp";
	}
	
	@GetMapping("/application")
	public ModelAndView getAppInfo() {
		ModelAndView view = new ModelAndView("app.jsp");
		view.addObject("appName","whatsapp");
		view.addObject("appVersion", "41.2");
		return view;
	}
}
