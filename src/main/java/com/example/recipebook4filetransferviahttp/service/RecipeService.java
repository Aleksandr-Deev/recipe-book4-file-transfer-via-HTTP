package com.example.recipebook4filetransferviahttp.service;

import com.example.recipebook4filetransferviahttp.model.Recipe;
import org.springframework.web.multipart.MultipartFile;
import java.util.Collection;

public interface RecipeService {

    Recipe addRecipe(Recipe recipe);

    Recipe getRecipeId(long id);

    Collection<Recipe> getAllRecipes();

    Recipe updateRecipe(long id, Recipe recipe);

    Recipe remoweRecipe(long id);

    byte[] getAllInBytes();

    void importRecipes(MultipartFile recipes);
}
