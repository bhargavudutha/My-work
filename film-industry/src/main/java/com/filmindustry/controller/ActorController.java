package com.filmindustry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.filmindustry.model.Actor;
import com.filmindustry.service.ActorService;


@RestController
public class ActorController {
	@Autowired
	private ActorService actorService;
	
	@PostMapping(value="/add")
	public ResponseEntity<Actor> addActor(@RequestBody Actor actor)
	{
		Actor addActor=actorService.addActor(actor);
		return new ResponseEntity<Actor>(addActor,HttpStatus.CREATED);
	}
	@GetMapping(value="/all")
	public ResponseEntity<List<Actor>> getActors()
	{
		List<Actor> getActors=actorService.getAllActors();
		return new ResponseEntity<List<Actor>>(getActors,HttpStatus.OK);
	}
	
	@GetMapping(value="/getactor/{id}")
	public ResponseEntity<Actor> getActorById(@PathVariable Integer id)
	{
		Actor getactor=actorService.getActorById(id);
		return new ResponseEntity<Actor>(getactor,HttpStatus.OK);
		
	}
	
	
	
	@DeleteMapping(value="/deleteactor/{id}")
	public ResponseEntity<Integer> deleteActorById(@PathVariable Integer id)
	{
		Integer deleteActor=actorService.deleteActorById(id);
		return new ResponseEntity<Integer>(deleteActor,HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping(value="/update")
	public ResponseEntity<Actor> updateActor(@RequestBody Actor actor)
	{
		Actor updateActor=actorService.addActor(actor);
		return new ResponseEntity<Actor>(updateActor,HttpStatus.ACCEPTED);
	}
	
	

}
