package com.example.recipebook4filetransferviahttp.service;

import com.example.recipebook4filetransferviahttp.model.Ingredient;
import org.springframework.core.io.InputStreamResource;
import org.springframework.web.multipart.MultipartFile;

public interface IngredientsService {

     Ingredient addIngredient(Ingredient ingredient);

     Ingredient getIngredientId(long id);

     Ingredient updateIngredient(long id, Ingredient ingredient);

     Ingredient remoweIngredient(long id);

     InputStreamResource getAllInBytes();

     void importIngredients(MultipartFile ingredients);

}