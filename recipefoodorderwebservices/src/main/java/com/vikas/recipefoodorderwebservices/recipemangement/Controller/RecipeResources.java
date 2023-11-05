package com.vikas.recipefoodorderwebservices.recipemangement.Controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.multipart.MultipartFile;

import com.vikas.recipefoodorderwebservices.recipemangement.Entity.RecipeEntity;

import com.vikas.recipefoodorderwebservices.recipemangement.Repository.RecipeRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class RecipeResources {
	
	private RecipeRepository recipeRepository;
	
	//constructor autowired
	public RecipeResources(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
		
	}
	
	@GetMapping("/recipes")
	public List<RecipeEntity> retriveAllRecipes(){
		return recipeRepository.findAll();
	}
	
	

     @PostMapping("/recipes")
	public RecipeEntity addRecipes( @RequestBody RecipeEntity recipeEntity ) {
		return recipeRepository.save(recipeEntity);
	}
     
    

}
