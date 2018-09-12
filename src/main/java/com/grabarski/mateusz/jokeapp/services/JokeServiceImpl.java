package com.grabarski.mateusz.jokeapp.services;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Mateusz Grabarski on 12.09.2018.
 */
@Service
public class JokeServiceImpl implements JokeService {

    @Override
    public String getJoke() {
        return UUID.randomUUID().toString();
    }
}