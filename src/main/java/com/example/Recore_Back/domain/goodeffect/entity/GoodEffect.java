package com.example.Recore_Back.domain.goodeffect.entity;

import com.sun.istack.NotNull;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
public class GoodEffect {
    @Id
    @GeneratedValue
    private Long goodEffectId;
    @NotNull
    private String title;
    private String imageUrl;
}
