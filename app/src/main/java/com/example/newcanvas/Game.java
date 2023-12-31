package com.example.newcanvas;

import java.util.ArrayList;

public class Game
{
    ArrayList<User> usersList;
    String subject;
    int status; // 0 - not in the game, 1 - in the game
    int numOfUsers;
    int countUsers; // How many users have entered the game? / how many users have rated the images?

    public void Game(String subj, int numOfUsers, int countUsers)
    {
        ArrayList<User> usersList = new ArrayList<>();
        subject = subj;
        numOfUsers = 0;
        countUsers = 0;
    }

    public void AddUser(User u)
    { usersList.add(u); }

    public void setSubject(String subj)
    { subject = subj; }



}
