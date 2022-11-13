package com.example.Recore_Back.domain.recipe.entity;

import com.example.Recore_Back.domain.user.entity.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="RECIPE_ID")
    private Long recipeID;
    private String recipeTitle;
    private String intro;
    private String ingredient;
    private String method;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    private User user;

//    @OneToMany(mappedBy="recipe")
//    private List<Image> images=new ArrayList<Image>();

}
