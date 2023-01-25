package edu.bu.bclaroni.gymnasticsmanager.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bu.bclaroni.gymnasticsmanager.app.entity.Team;
import edu.bu.bclaroni.gymnasticsmanager.app.repository.TeamRepository;
import jakarta.annotation.PostConstruct;

@Service
public class DataSeedingService {
    @Autowired TeamRepository teamRepository;

    @PostConstruct
    public void seedDatabase() {
        Team team1 = new Team();
        team1.setTeamName("Wilmington");
        teamRepository.save(team1);
    }
}
