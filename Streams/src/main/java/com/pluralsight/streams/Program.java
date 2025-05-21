package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        List<Person> matchedPeople = new ArrayList<>();

        for (Person person : people) {
            if (person.getFirstName().toLowerCase().equals(searchName) ||
                    person.getLastName().toLowerCase().equals(searchName)) {
                matchedPeople.add(person);
            }
        }

        System.out.println("Matched people:");
        for (Person person : matchedPeople) {
            System.out.println(person.getFullName());
        }

        int totalAge = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (Person person : people) {
            int age = person.getAge();
            totalAge += age;

            if (age > oldest) {
                oldest = age;
            }

            if (age < youngest) {
                youngest = age;
            }
        }

        double averageAge = (double) totalAge / people.size();

        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}
