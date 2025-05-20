package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this should fail
        System.out.println("Number of integers: " + numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        // dates.add(15); // This should fail, won't compile - 15 is not LocalDate

        System.out.println("Number of dates: " + dates.getItems().size());
    }
}
