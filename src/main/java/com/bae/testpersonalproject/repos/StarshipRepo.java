package com.bae.testpersonalproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.testpersonalproject.domain.Starship;

@Repository
public interface StarshipRepo extends JpaRepository<Starship, Long> {

}
