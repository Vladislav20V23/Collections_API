package com.example.collections;

import com.example.objects.Animal;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueDequeCollections {

    public static void main(String[] args){

        //сортировка PriorityQueue согласно естественному порядку сортировки
        PriorityQueue<String> StringQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));

        StringQueue.add("Vlad");
        StringQueue.add("Yuliy");
        StringQueue.add("Roma");
        StringQueue.add("Sem");

        while (!StringQueue.isEmpty()){
            System.out.println(StringQueue.remove());
        }

        System.out.println("------------------------------------");

        Deque<String> StringDeque = new ArrayDeque<>();
        StringDeque.add("Vlad");
        StringDeque.add("Yuliy");
        StringDeque.addFirst("Roma");
        StringDeque.addLast("Sem");
        StringDeque.add("Ventus");



        System.out.println(StringDeque);
        System.out.println("Первый элемент очереди " + StringDeque.getFirst());
        System.out.println("Последний элемент очереди " + StringDeque.getLast());
        System.out.println("Удаляем верхний элемент очереди (get exception) " + StringDeque.pop());
        System.out.println("Удаляем верхний элемент очереди (get null)  " + StringDeque.poll());

        System.out.println("------------------------------------");

        Deque<String> AnimalDeque = new ArrayDeque<>();
        Animal animalName = new Animal();

        for(int i = 1; i < 6; i++){
            AnimalDeque.add(animalName.getStringDeque());
        }
        System.out.println(AnimalDeque);
        System.out.println("Первый элемент очереди " + AnimalDeque.pollFirst());  // вытащит и удалит первый элемент очереди
        System.out.println("Последний элемент очереди " + AnimalDeque.pollLast()); // вытащит и удалит последний элемент очереди
        System.out.println("Первый элемент очереди " + AnimalDeque.peekFirst());  // вытащит первый элемент очереди
        System.out.println("Последний элемент очереди " + AnimalDeque.peekLast());  // вытащит и удалит первый элемент очереди

        System.out.println(AnimalDeque);

    }

}
