package com.example.newcanvas;

public class User
{
    private String username;
    private String password;
    private String email;
    private int birthYear;

    public User(String name, String password, String email, int year)
    {
        username = name;
        password = password;
        email = email;
        birthYear = year;
    }



    public void setUserName(String name)
    { username = name; }

    public void setPassword(String password)
    { password = password; }

    public void setEmail(String email)
    { email = email; }

    public void setYear(int year)
    { birthYear = year; }

    public String getUserName(){ return username; }
    public String getPassword(){ return password; }
    public String getEmail(){ return email; }
    public int getBirthYear(){ return birthYear; }
}
