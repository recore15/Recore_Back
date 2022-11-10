package com.example.Recore_Back.domain.user.entity;

import com.example.Recore_Back.domain.campaign.entity.Campaign;
import com.example.Recore_Back.domain.recipe.entity.Recipe;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
    private Long userID;
    private String email;
    private String imageUrl;
    private String userName;

    @OneToMany(mappedBy = "user")
    private List<Campaign> campaigns=new ArrayList<Campaign>();

    @OneToMany(mappedBy="user")
    private List<Recipe> recipes=new ArrayList<Recipe>();

    @Builder
    public User(String email, String imageUrl, String userName){
        this.email=email;
        this.imageUrl=imageUrl;
        this.userName=userName;
    }
}
