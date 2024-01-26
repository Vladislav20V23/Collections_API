package com.example;


import com.example.objects.User;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {

        User user = new User();
        List<User> userPartyOne = user.CreateUserList(4);
        for(User a : userPartyOne){
            System.out.println(a);
        }
        System.out.println(" -------------------------------");

        List<User> userPartyTwo = user.CreateUserList(1);
        userPartyOne.addAll(0, userPartyTwo);
        for(User a : userPartyOne){
            System.out.println(a);
        }
        System.out.println(" -------------------------------");

        userPartyOne.clear();
        System.out.println(userPartyOne);



    }
}
