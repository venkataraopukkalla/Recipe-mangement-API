package com.vikas.recipefoodorderwebservices.recipemangement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vikas.recipefoodorderwebservices.recipemangement.Entity.RecipeEntity;

@Controller
public class RecipeView {

	@GetMapping("/addrecipes")
	public String loginpage() {
		return "loginpage";
	}

	
//	

}
