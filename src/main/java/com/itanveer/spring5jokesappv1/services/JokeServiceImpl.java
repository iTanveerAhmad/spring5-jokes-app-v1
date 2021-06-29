package com.itanveer.spring5jokesappv1.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes ChuckNorrisQuotes;

    public JokeServiceImpl() {
        this.ChuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return ChuckNorrisQuotes.getRandomQuote();
    }
}
