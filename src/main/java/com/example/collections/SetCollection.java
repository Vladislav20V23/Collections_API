package com.example.collections;

import com.example.objects.Animal;

import java.util.*;
import java.util.stream.Collectors;


public class SetCollection {

    public static void main(String[] args) {


        Animal animal = new Animal();
        Set<String> bagAnimalsName = new HashSet<>();       // случайная сортировка

        for(int i=0; i<5;i++) {
            bagAnimalsName.add(animal.getStringDeque());
        }
        System.out.println(bagAnimalsName);

        System.out.println("Содержится ли имя cat в наборе bagAnimalsName размером в " + bagAnimalsName.size() + " элементов? " + bagAnimalsName.contains("cat"));
        System.out.println("------------------------------------------");


        Set<String> hashSet = new HashSet<> ();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        System.out.println(hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>(hashSet);
        System.out.println(linkedHashSet);

        Set<String> treeSet = new TreeSet<>((string1, string2) -> string2.compareTo(string1));
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("d");
        System.out.println(treeSet);
        System.out.println("------------------------------------------");

        List<String> list = new ArrayList<>(Arrays.asList("Vova", "Max", "Vova", "Ira", "Oleg", "Max"));
        Set<String> noDuplicates = new HashSet<>(list);
        System.out.println("Переобразовуем list с дубликатами в Set с уникальными значениями: " + noDuplicates);


    }
}
