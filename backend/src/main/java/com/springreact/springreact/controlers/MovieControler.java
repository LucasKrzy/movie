package com.springreact.springreact.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.springreact.dto.MovieDTO;
import com.springreact.springreact.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieControler {
	
	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<MovieDTO> findall(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value="/{id}")
	public MovieDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
}
