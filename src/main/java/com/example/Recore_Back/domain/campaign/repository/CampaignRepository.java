package com.example.Recore_Back.domain.campaign.repository;

import com.example.Recore_Back.domain.campaign.entity.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
