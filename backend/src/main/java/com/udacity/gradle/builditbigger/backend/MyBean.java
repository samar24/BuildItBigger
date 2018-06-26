package com.udacity.gradle.builditbigger.backend;
import example.samar.myjavalib.MyClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {


    private String myData;
    private MyClass joker;
    private String Joke;

    public String getData() {
        return myData;
    }

    public void setJoke() {
        joker = new MyClass();
        Joke = joker.getJoke();

        myData = Joke;
    }
}