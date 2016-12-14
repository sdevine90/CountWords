package com.example.user.countwords;

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by user on 13/12/2016.
 */
public class Wordcount {
    private ArrayList<String> words;
    private String line;


    public Wordcount(String line){
        words = new ArrayList<String>();
        this.line = line;

    }

    public int getWords(){
        for (String word : line.split(" ")){
            words.add(word);
            }
        return words.size();
        }
//    for loop to get my count in my string return (int) everything into line. Command called .split
// that takes everything in a string and splits the words add everything you split in the array list
//    words.add (word.size calling a method on the amount of words that are in the arraylist

    }

