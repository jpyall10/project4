package com.example;

import java.util.ArrayList;
import java.util.Random;

public class Joker {

    private ArrayList<String> jokes;

    public Joker(){
        jokes = new ArrayList<String>();
        jokes.add("This is the first stupid joke");
        jokes.add("This is the second stupid joke");
        jokes.add("This is the third stupid joke");
        jokes.add("This is the fourth stupid joke");
        jokes.add("This is the fifth stupid joke");
        jokes.add("This is the sixth stupid joke");
        jokes.add("This is the sevent stupid joke");
        jokes.add("This is the eighth stupid joke");
        jokes.add("This is the ninth stupid joke");
        jokes.add("This is the tenth stupid joke");
    }

    public String getJoke() {
        Random random = new Random();
        int index = random.nextInt(jokes.size());
        return jokes.get(index);
    }

//    public void addJoke(String joke){
//        jokes.add(joke);
//    }

}
