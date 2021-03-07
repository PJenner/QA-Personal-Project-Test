package com.bae.testpersonalproject.service.starship;

import org.springframework.stereotype.Service;

import com.bae.testpersonalproject.domain.Starship;
import com.bae.testpersonalproject.repos.StarshipRepo;

@Service
public class StarshipServiceDB implements StarshipService {

	private StarshipRepo repo;

	public StarshipServiceDB(StarshipRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Starship createStarship(Starship starship) {
		return this.repo.save(starship);
	}

}