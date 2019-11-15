package com.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {


    List<String> memberNames = new ArrayList<String>();

    StreamsDemo() {
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

    }

    public static void main(String[] args) {

        streamExample5();

    }


    public static void streamExample1() {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }


    //Convert StreamtoList–Stream.collect(Collectors.toList())
    public static void streamExample2() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbersList);
    }

    //Print words starts with A
    public static void streamExample3() {
        new StreamsDemo().memberNames.stream().filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);
    }

    //Print words starts with A in Uppercase
    public static void streamExample4() {
        new StreamsDemo().memberNames.stream().filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }


    //Print words in Uppercase in sorted order
    public static void streamExample5() {
        new StreamsDemo().memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
System.out.println("\n\n In Reverse order\n\n");

        new StreamsDemo().memberNames.stream().sorted(Collections.reverseOrder())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    //Collect words in a list
    public static void streamExample6() {

        List<String> memNamesInUppercase = new StreamsDemo().memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print(memNamesInUppercase);
    }


    //Check the matching string in a list
    public static void streamExample7() {

        boolean matchedResult = new StreamsDemo().memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = new StreamsDemo().memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = new StreamsDemo().memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);
    }


    //Modify objects
    public static void streamExample8() {

        List<Person> persons = Arrays.asList(
                new Person("bob", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result1 = persons.stream()
                .filter(x -> "jack".equals(x.getName()))
                .findAny()//If 'findAny' then return found
                .orElse(null); //If not found, return null

        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "ahmook".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);

    }


    //Collect names in a list
    public static void streamExample9() {

        List<Person> persons = Arrays.asList(
                new Person("bob", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        String name = persons.stream()
                .filter(x -> "jack".equals(x.getName()))
                .map(Person::getName)
                .findAny()
                .orElse("");

        System.out.println("name:" + name);

        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
