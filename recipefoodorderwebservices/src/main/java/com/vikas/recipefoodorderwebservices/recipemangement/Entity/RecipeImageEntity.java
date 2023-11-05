package com.vikas.recipefoodorderwebservices.recipemangement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RecipeImageEntity {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String imageName;
	private String imageType;
	private String imagePath;
	public RecipeImageEntity() {
		// TODO Auto-generated constructor stub
	}
	public RecipeImageEntity(String imageName, String imageType, String imagePath) {
		super();
		this.imageName = imageName;
		this.imageType = imageType;
		this.imagePath = imagePath;
	}
	public Long getId() {
		return id;
	}
	public String getImageName() {
		return imageName;
	}
	public String getImageType() {
		return imageType;
	}
	public String getImagePath() {
		return imagePath;
	}
	
}
