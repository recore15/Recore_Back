package com.example.Recore_Back.domain.campaign.entity;

import com.example.Recore_Back.domain.user.entity.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CAMPAIGN_ID")
    private Long campaignID;
    private String campaignTitle;
    private LocalDateTime duringDate;
    private String place;
    private LocalDateTime deadLineDate;
    private String content;

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;

    //연관관계 매핑
    public void setUser(User user){
        this.user=user;
    }

}
