package com.vikas.recipefoodorderwebservices.recipemangement.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vikas.recipefoodorderwebservices.recipemangement.Entity.RecipeEntity;
import com.vikas.recipefoodorderwebservices.recipemangement.Entity.RecipeImageEntity;
import com.vikas.recipefoodorderwebservices.recipemangement.Repository.ImageRepository;
import com.vikas.recipefoodorderwebservices.recipemangement.Repository.ImageService;

@RestController
public class ImageResources {
    
    @Autowired
    private ImageService imService;
    
    @Autowired
    private ImageRepository imRepository;
    
    @PostMapping("/addimages")
    public ResponseEntity<?> addImage(@RequestPart("image") MultipartFile file) {
        String fileSystem = imService.uploadToFileSystem(file);
        if (fileSystem != null && !fileSystem.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK)
                    .contentType(MediaType.TEXT_PLAIN)
                    .body(fileSystem);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Failed to upload the file");
        }
    }
   
    @GetMapping("/showmeimages")
	public List<RecipeImageEntity> retriveAllRecipes(){
		return imRepository.findAll();
	}
    
    @GetMapping("/images/{fileName}")
    public ResponseEntity<?> downloadImage(@PathVariable String fileName) throws IOException{
    	byte[] fileSystem = imService.downloadImagefromFileSystem(fileName);
    	
    	return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.TEXT_PLAIN)
                .body(fileSystem);
    	
    }
}
