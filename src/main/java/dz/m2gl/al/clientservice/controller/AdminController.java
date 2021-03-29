package dz.m2gl.al.clientservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping("/admin")
	public String administration(Model model) {
		//List<Course> listProducts = service.listAll();
		

		return "admin";
	}
	



}
