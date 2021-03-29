package dz.m2gl.al.clientservice.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dz.m2gl.al.clientservice.dto.ModuleDto;

@FeignClient(name = "course-service", url = "localhost:8001")
public interface MicroserviceModulesProxy {
	
	@GetMapping(value = "/modules")
	List<ModuleDto> listModules();

	@GetMapping( value = "/module/{id}")
	ModuleDto oneModule(@PathVariable("id") int id);

}
