package com.sergio.springbootjokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sergio.springbootjokesapp.services.RandomJokeService;

@Controller
public class RandomJokesController {

	private RandomJokeService randomJokesService;

	@Autowired
	public RandomJokesController(RandomJokeService randomJokesService) {
		this.randomJokesService = randomJokesService;
	}

	public String sayRandomJoke() {
		return randomJokesService.getJoke();
	}
	
	@RequestMapping({"/",""})
	public String getRandomJokes(Model model) {
		
		model.addAttribute("joke",sayRandomJoke());
		
		return "chucknorris";
	}

}
