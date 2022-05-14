package com.springreact.springreact.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.springreact.dto.MovieDTO;
import com.springreact.springreact.dto.ScoreDTO;
import com.springreact.springreact.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreControler {
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}
}
