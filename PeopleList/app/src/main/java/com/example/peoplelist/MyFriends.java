package com.example.peoplelist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyFriends {

    List<Person> myFriendsList;

    public MyFriends() {
        String[] startingNames = {"Anselm", "Beatrice", "Carlyle"};
        this.myFriendsList = new ArrayList<>();
        Random rng = new Random();
        for(int i =0; i<startingNames.length; i++){
            Person p = new Person(startingNames[i],rng.nextInt(50)+15, rng.nextInt(30));
            myFriendsList.add(p);
        }
    }



    public List<Person> getMyFriendsList() {
        return myFriendsList;
    }

    public void setMyFriendsList(List<Person> myFriendsList) {
        this.myFriendsList = myFriendsList;
    }
}
