package com.sebs.database;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Project101Controller {

	@Autowired
	AlienRepo  alienRepo;
	Alien alien;
	
	@RequestMapping("/")
	public String home() {
		return "Welcome Sebastin";
	}
	
	
	@RequestMapping("/alien")
	public  Alien addAliens(Alien alien) {
	
		alienRepo.save(alien);
		return alien;
	}
	
	
	@RequestMapping("/aliens")
	@ResponseBody
	public  List<Alien> getAliens() {
	
		/*if(alienRepo.findAll().toString()==null) {
			System.out.println("Error Occured");
		}*/
		
		return alienRepo.findAll();
	}
	
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public Optional<Alien> getAliens(@PathVariable("aid") int aid) {
	
		/*if(alienRepo.findAll().toString()==null) {
			System.out.println("Error Occured");
		}*/
		
		return alienRepo.findById(aid);
	}
	
}
