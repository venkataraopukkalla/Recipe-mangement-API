package com.vikas.recipefoodorderwebservices.recipemangement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikas.recipefoodorderwebservices.recipemangement.Entity.RecipeEntity;

public interface RecipeRepository extends JpaRepository<RecipeEntity, Long>{

}
