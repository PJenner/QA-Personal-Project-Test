package com.bae.testpersonalproject.service.starship;

import java.util.List;

import com.bae.testpersonalproject.domain.Starship;

public interface StarshipService {

	Starship createStarship(Starship starship);

	List<Starship> getAllStarships();

}
