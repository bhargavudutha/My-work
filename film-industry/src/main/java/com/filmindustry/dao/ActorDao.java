package com.filmindustry.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filmindustry.model.Actor;
@Repository
public interface ActorDao extends JpaRepository<Actor,Integer> {

}
