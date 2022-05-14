package com.springreact.springreact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.springreact.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
