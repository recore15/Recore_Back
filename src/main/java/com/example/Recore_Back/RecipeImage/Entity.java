package com.example.Recore_Back.RecipeImage;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
public class Entity {
    @Id
    @GeneratedValue
    private Long id;
    private String imageKey;

    private Long recipeId;
    private Enum imageTYPE;
    private Long CampaignId;
}
