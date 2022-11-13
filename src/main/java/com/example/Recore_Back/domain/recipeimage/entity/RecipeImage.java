package com.example.Recore_Back.domain.recipeimage.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
public class RecipeImage {
    @Id
    @GeneratedValue
    private Long id;
    private String imageKey;

    private Long recipeId;
    private Enum imageTYPE;
    private Long CampaignId;
}
