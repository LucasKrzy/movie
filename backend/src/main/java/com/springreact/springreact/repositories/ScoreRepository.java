package com.springreact.springreact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.springreact.entities.Score;
import com.springreact.springreact.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
