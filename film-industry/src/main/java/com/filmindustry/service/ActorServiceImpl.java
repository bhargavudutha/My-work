package com.filmindustry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filmindustry.dao.ActorDao;
import com.filmindustry.model.Actor;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorDao actorRepository;

	@Override
	public Actor addActor(Actor actor) {

		return actorRepository.save(actor);
	}

	@Override
	public List<Actor> getAllActors() {

		return actorRepository.findAll();
	}

	@Override
	public Actor getActorById(Integer id) {
		/*
		 * return actorRepository.getById(id); //Lazy loading so to avoid we added
		 * extension in application.properties(or changes in pojo) and we can get only
		 * instance to it but not access to DB
		 */
		return actorRepository.findById(id).get(); // optional classes //EagerLoading
	}

	@Override
	public Integer deleteActorById(Integer id) {
		actorRepository.deleteById(id);
		return id;
	}

}
