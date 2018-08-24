package com.josehinojo.javajokes;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {
    public static ArrayList<String> jokesList = new ArrayList<>();

    public Jokes(){
        initializeJokes();
    }

    public void initializeJokes(){
        jokesList.add("1");
        jokesList.add("2");
        jokesList.add("3");
        jokesList.add("4");
        jokesList.add("5");
        jokesList.add("6");
        jokesList.add("7");
        jokesList.add("8");
        jokesList.add("9");
        jokesList.add("10");
    }

    public String getAJoke(){
        Random random = new Random();
        return jokesList.get(random.nextInt(10));
    }

}
