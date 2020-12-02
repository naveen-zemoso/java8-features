package com.learn.lamda;

import com.learn.inheritence.Book;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String args[]) {

        List<Book> books = Arrays.asList(new Book("title1", "naveen"), new Book("title2", "kiran"),
        new Book("title3", "mahesh"),new Book("title4", "naveen"),new Book("title5", "naveen"));


        System.out.println(books.stream()
                .filter(book -> "naveen".equals(book.author))
                .count());

        List<String> naveenBooks = books.stream()
                .filter(book -> "naveen".equals(book.author))
                .map(book -> book.title)
                .collect(Collectors.toList());

        books.stream()
                .filter(book -> "naveen".equals(book.author)); //doesn't execute

        System.out.println(naveenBooks);


        // Lamda

        NumberOrder numberOrder = new NumberOrder();

        final List<Integer> integers = Arrays.asList(1, 3, 5, 7, 2, 4, 8);

        // Same Order
        numberOrder.order((list)-> {integers.forEach(System.out::print);}, integers);

        // Reverse Order

        System.out.println();

        numberOrder.order((list)-> {
            Collections.reverse(integers);
            integers .forEach(System.out::print);}, integers);

        System.out.println();

        // Random Order
        numberOrder.order((list)-> {Collections.shuffle(integers);
            integers .forEach(System.out::print);}, integers);

    }
}
