package dz.m2gl.al.clientservice.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dz.m2gl.al.clientservice.dto.*;
import dz.m2gl.al.clientservice.proxies.MicroserviceModulesProxy;







@Controller
@RequestMapping("/")
public class CourseController {
	   private MicroserviceModulesProxy ModulesProxy;
	
	
	
	public String viewHomePage(Model model) {
		
		 List<ModuleDto> modules =  ModulesProxy.listModules();

	        model.addAttribute("modules", modules);

		return "index";
	}
	
	
	public String showNewProductPage(Model model) {
		

		return "new";
	}
	
	


}
