package com.example;

import java.util.ArrayList;
import java.util.Random;

public class Joker {

    private ArrayList<String> jokes;

    public Joker(){
        jokes = new ArrayList<String>();
        jokes.add("This is the first joke");
        jokes.add("This is the second joke");
        jokes.add("This is the third joke");
        jokes.add("This is the fourth joke");
        jokes.add("This is the fifth joke");
        jokes.add("This is the sixth joke");
        jokes.add("This is the seventh joke");
        jokes.add("This is the eighth joke");
        jokes.add("This is the ninth joke");
        jokes.add("This is the tenth joke");
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
