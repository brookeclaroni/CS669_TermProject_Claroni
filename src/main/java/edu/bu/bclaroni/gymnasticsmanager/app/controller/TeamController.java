package edu.bu.bclaroni.gymnasticsmanager.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.bu.bclaroni.gymnasticsmanager.app.entity.Team;
import edu.bu.bclaroni.gymnasticsmanager.app.service.TeamService;

@RestController
public class TeamController {

    @Autowired TeamService teamService;

	@GetMapping("/teams")
	public List<Team> index() {
		return teamService.getTeams();
	}

}
