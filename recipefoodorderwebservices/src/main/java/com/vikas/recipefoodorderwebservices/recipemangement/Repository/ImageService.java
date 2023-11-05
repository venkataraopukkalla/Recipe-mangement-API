package com.vikas.recipefoodorderwebservices.recipemangement.Repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.vikas.recipefoodorderwebservices.recipemangement.Entity.RecipeImageEntity;

@Service
public class ImageService {
	
	
	 private String uploadDirectory = "\\Users\\vikra\\OneDrive\\Pictures\\RestApi"; // Relative path within your application

	    @Autowired
	    private ImageRepository imageRepository;

	    public String uploadToFileSystem(MultipartFile file) {
	        try {
	            String fileName = file.getOriginalFilename();
	            String filePath = Paths.get(uploadDirectory, fileName).toString();
	            RecipeImageEntity save = imageRepository.save(new RecipeImageEntity(fileName, file.getContentType(), filePath));
	            
	            // Save the file to the specified directory
	            Files.copy(file.getInputStream(), Paths.get(uploadDirectory, fileName), StandardCopyOption.REPLACE_EXISTING);
	            
	            if (save != null) {
	                return "File uploaded successfully: " + filePath;
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        return "";
	    }

	
	public byte[] downloadImagefromFileSystem(String fileName) throws IOException {
		
		Optional<RecipeImageEntity> entOptional=imageRepository.findByImageName(fileName);
		String imagePath = entOptional.get().getImagePath();
		byte[] allBytes = Files.readAllBytes(new File(imagePath).toPath());
		
		return allBytes;
		
	}

}
