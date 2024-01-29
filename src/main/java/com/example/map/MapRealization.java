package com.example.map;

import java.util.*;
import java.util.stream.Collectors;

public class MapRealization {


    public static void main( String[] args ){

        Map<String, Integer> stringMap = new HashMap<>();
        stringMap.put("Dog", 5);
        stringMap.put("Rabbits", 17);
        stringMap.put("Wolf", 2);
        stringMap.put("Cat", 8);

        int x = 0;
        for(Map.Entry<String, Integer> entry : stringMap.entrySet()){       //перебор значений Map
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("На " + x + " месте размещается ключ " + key + " со значением " + value);
            x++;
        }

        System.out.println("Количество волков = " + stringMap.get("Wolf"));
        System.out.println("------------------------------------------------");

        List <String> keyList = new ArrayList<>(stringMap.keySet());        // конвертация Map в List
        List <Integer> valueList = new ArrayList<>(stringMap.values());
        List <Map.Entry<String, Integer>> entryList = new ArrayList<>(stringMap.entrySet());

        System.out.println(keyList);
        System.out.println(valueList);
        System.out.println(entryList);

        System.out.println("------------------------------------------------");

        Map <String, Integer> mapOne = new HashMap<>();     //  сортировка String HashMap по ключу
        mapOne.put("John", 21);
        mapOne.put("Maria", 27);
        mapOne.put("Sydney", 24);
        mapOne.put("Mark", 27);

        mapOne.entrySet().forEach(System.out::println);

        System.out.println("------------------------------------------------");

        Map<String, Integer> sortTree = new TreeMap<>(mapOne);  //сортировка через дефолтный компаратора TreeMap
        sortTree.put("Mbrov", 30);
        sortTree.put("Sykty", 22);
        sortTree.entrySet().forEach(System.out::println);

        System.out.println("------------------------------------------------");

// сортировка с помощью своего компаратора
//        Map<String, Integer> sortTreeCompare = new TreeMap<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int lenghtDifference = o1.length() - o2.length();
//                if(lenghtDifference != 0) return lenghtDifference;
//                return o1.compareTo(o2);
//            }
//        });
//
//        sortTreeCompare.putAll(sortTree);
//        sortTreeCompare.entrySet().forEach(System.out::println);

        //Сортировка HashMap по ключу с LinkedHashMap
        Map<String, Integer> sortedMap = sortTree.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));

        sortedMap.entrySet().forEach(System.out::println);

    }


}
