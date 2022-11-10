package com.example.Recore_Back.domain.HowTo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.awt.*;
import java.util.List;

public class Entity {
    @Id
    @GeneratedValue
    private Long howToId;
    private Enum boardType;
    private String title;
    private String imageUrl;
    private List<String> methodContent;
    private List<Image> methodImage;
}
