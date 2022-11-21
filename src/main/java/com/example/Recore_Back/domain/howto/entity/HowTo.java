package com.example.Recore_Back.domain.howto.entity;

import com.sun.istack.NotNull;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.awt.*;
import java.util.List;

public class HowTo {
    @Id
    @GeneratedValue
    private Long howToId;
    private Enum boardType;
    @NotNull
    private String title;
    dsad
    private String imageUrl;
    private List<String> methodContent;
    private List<Image> methodImage;
}
