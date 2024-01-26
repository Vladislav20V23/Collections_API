package com.example.collections;

import com.example.objects.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListCollections
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
        System.out.println("Теперь о бщий размер листа составляет " + userPartyOne.size());
        System.out.println(" -------------------------------");

        User userOne = userPartyOne.get(3);
        userPartyOne.add(userOne);
        int indexUserOne = userPartyOne.indexOf(userOne);
        System.out.println("Индекс первого вхождения indexUserOne = " + indexUserOne);
        indexUserOne = userPartyOne.lastIndexOf(userOne);
        System.out.println("Индекс последнего вхождения indexUserOne = " + indexUserOne);
        System.out.println(userOne);
        System.out.println(" -------------------------------");

        List userPartyThree = userPartyOne.subList(1,3);
        userPartyThree.contains(userOne);
        System.out.println("Содержится ли объект userOne в списке userPartyThree? " + userPartyThree.contains(userOne));
        for(Object b : userPartyThree){
            System.out.println(b);
        }
        System.out.println(" -------------------------------");


        System.out.println(userPartyThree);

        for(User a : userPartyOne){
            System.out.println(a);
        }

        System.out.println(" -------------------------------");

        List<User> books = new ArrayList<User>();               //сортировка объектов по полю имени
        books.addAll(userPartyOne);
        Collections.sort(books, new Comparator<User>(){
            public int compare(User o1, User o2)
            {
                return o1.nameUser.compareTo(o2.nameUser);
            }
        });

        for(User a : books){
            System.out.println(a);
        }

        System.out.println(" -------------------------------");

        userPartyOne.clear();
        System.out.println(userPartyOne);



    }
}

