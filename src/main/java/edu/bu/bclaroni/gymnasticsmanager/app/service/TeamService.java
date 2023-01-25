package edu.bu.bclaroni.gymnasticsmanager.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bu.bclaroni.gymnasticsmanager.app.entity.Team;
import edu.bu.bclaroni.gymnasticsmanager.app.repository.TeamRepository;

@Service
public class TeamService {
    @Autowired TeamRepository teamRepository;
    
    public List<Team> getTeams() {
        List<Team> teams = teamRepository.findAll();
        return teams;
    }
}
