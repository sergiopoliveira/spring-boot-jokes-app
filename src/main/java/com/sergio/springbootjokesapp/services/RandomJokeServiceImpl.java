package com.sergio.springbootjokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class RandomJokeServiceImpl implements RandomJokeService {

	private final ChuckNorrisQuotes chuck;

	public RandomJokeServiceImpl() {
		this.chuck = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuck.getRandomQuote();
	}
}
