package com.vikas.recipefoodorderwebservices.recipemangement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikas.recipefoodorderwebservices.recipemangement.Entity.RecipeImageEntity;


public interface ImageRepository extends JpaRepository<RecipeImageEntity, Long> {

	Optional<RecipeImageEntity> findByImageName(String fileName);

	

}
