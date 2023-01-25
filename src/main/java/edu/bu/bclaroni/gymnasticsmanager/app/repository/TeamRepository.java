package edu.bu.bclaroni.gymnasticsmanager.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.bu.bclaroni.gymnasticsmanager.app.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, String>{
    List<Team> findAll();
}
