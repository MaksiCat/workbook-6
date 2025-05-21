package com.pluralsight.streamspart2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Smith", 30));
        people.add(new Person("Emily", "Brown", 22));
        people.add(new Person("Michael", "Johnson", 45));
        people.add(new Person("Sarah", "Miller", 28));
        people.add(new Person("David", "Wilson", 35));
        people.add(new Person("Anna", "Moore", 19));
        people.add(new Person("James", "Taylor", 52));
        people.add(new Person("Olivia", "Anderson", 27));
        people.add(new Person("Daniel", "Thomas", 41));
        people.add(new Person("Sophia", "Jackson", 33));

        System.out.print("Enter a first or last name to search: ");
        String searchName = scanner.nextLine().toLowerCase();

        // Step 1: search with stream and filter
        List<Person> matchedPeople = people
                .stream()
                .filter(person -> person.getFirstName().toLowerCase().equals(searchName)
                        || person.getLastName().toLowerCase().equals(searchName))
                .collect(Collectors.toList());

        System.out.println("Matched people:");
        for (Person p : matchedPeople) {
            System.out.println(p.getFullName());
        }

        // Step 2: average age using stream
        IntStream ageStream = people.stream().mapToInt(Person::getAge);
        double averageAge = ageStream.average().orElse(0);
        System.out.println("Average age: " + averageAge);

        // Step 3: max and min age using stream
        int oldest = people.stream().mapToInt(Person::getAge).max().orElse(0);
        int youngest = people.stream().mapToInt(Person::getAge).min().orElse(0);

        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}
