package com.filmindustry.service;

import java.util.List;

import com.filmindustry.model.Actor;

public interface ActorService {

	public abstract Actor addActor(Actor actor);

	public abstract List<Actor> getAllActors();

	public abstract Actor getActorById(Integer id);

	public abstract Integer deleteActorById(Integer id);

}
