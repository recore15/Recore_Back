package com.example.Recore_Back.GoodEffect;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
public class Entity {
    @Id
    @GeneratedValue
    private Long goodEffectId;
    private String title;
    private String imageUrl;
}
