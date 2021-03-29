package dz.m2gl.al.clientservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModulesController {
	
	@RequestMapping("/modules")
	public String modules(Model model) {
		//List<Course> listProducts = service.listAll();
		

		return "modules";
	}


}
