package com.example.Recore_Back.domain.recipeimage.repository;

import com.example.Recore_Back.domain.recipe.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeImageRepository extends JpaRepository<Recipe, Long> {
}
