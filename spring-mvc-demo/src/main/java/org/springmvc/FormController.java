package org.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FormController {
	
	@GetMapping("/form")
	public String triggerForm() {
		return "form.jsp";
	}

	@PostMapping("/save")
	public ModelAndView formDetail(HttpServletRequest request) {
		String name = request.getParameter("studentName");
		String id = request.getParameter("studentId");
		String age = request.getParameter("studentAge");
		String gender = request.getParameter("studentGender");
		
		ModelAndView view = new ModelAndView("display.jsp");
		view.addObject("sname", name);
		view.addObject("sid", id);
		view.addObject("sage", age);
		view.addObject("sgender", gender);
		return view;
	}
}
