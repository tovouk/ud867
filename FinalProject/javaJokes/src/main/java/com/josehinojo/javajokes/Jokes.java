package com.josehinojo.javajokes;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {
    public static ArrayList<String> jokesList = new ArrayList<>();

    public Jokes(){
        initializeJokes();
    }

    //credit goes to https://www.funnyjokeslist.com/the-best-jokes-for-kids/
    public void initializeJokes(){
        jokesList.add("How do all the oceans say hello to each other?\n" +
                "They wave!");
        jokesList.add("What did one wall say to the other wall?\n" +
                "I’ll meet you at the corner!");
        jokesList.add("What do you call a bear with no teeth?\n" +
                "A gummy bear!");
        jokesList.add("What do you call cheese that’s not yours?\n" +
                "Nacho cheese!");
        jokesList.add("What do you get when you cross a snowman and a vampire?\n" +
                "Frostbite!");
        jokesList.add("What do elves learn in school?\n" +
                "The elf-abet.");
        jokesList.add("Why are seagulls called seagulls?\n" +
                "Because if they flew over the bay, they’d be bagels!");
        jokesList.add("Why did the girl smear peanut butter on the road?\n" +
                "To go with the traffic jam! ");
        jokesList.add("How do you make a tissue dance?\n" +
                "You put a little boogie in it. ");
        jokesList.add("What do you call a fake noodle?\n" +
                "An impasta! ");
    }

    public static ArrayList<String> getJokesList() {
        return jokesList;
    }

    public String getAJoke(){
        Random random = new Random();
        return jokesList.get(random.nextInt(10));
    }

}
