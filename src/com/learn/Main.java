package com.learn;

import com.learn.abstraction.Circle;
import com.learn.abstraction.Rectangle;
import com.learn.abstraction.Shape;
import com.learn.encapsulation.Record;
import com.learn.inheritence.*;
import com.learn.ploymorphism.Calculator;
import com.learn.ploymorphism.InkPrinter;
import com.learn.ploymorphism.Printer;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Single Inheritence
        MountainBicycle mountainBicycle = new MountainBicycle(2, 4, 10, 5);
        System.out.println(mountainBicycle.toString());
        mountainBicycle.applyBreak(5);
        System.out.println(mountainBicycle.toString());

        // Has-A Aggregation relationship
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("emp1", 10));
        employees.add(new Employee("emp2", 20));
        Bank bank = new Bank("AXIS", employees);


        //Has-A Composition relationship

        Book book = new Book("rama", "ravi");
        Book book1 = new Book("maha", "val");
        Library library = new Library(Arrays.asList(book, book1));




        // Method Overloading

        Calculator calculator = new Calculator();
        calculator.add(1, 2);
        calculator.add(1.1, 2.2);

        // Method Overriding
        Printer printer = new Printer();
        printer.print("Hello");

        InkPrinter inkPrinter = new InkPrinter();
        inkPrinter.print("Hello");

        Printer printerInk = new InkPrinter();
        printerInk.print("Hello");  //runtime


        // Abstraction

        Shape circle = new Circle("red", 2.0);
        Shape rectangle = new Rectangle("green", 3.0, 2.0);

        System.out.println("Circle Area: "+circle.area());
        System.out.println("Rectangle Area: "+rectangle.area());

        // Encapsulation
        Record record = new Record();
        record.setContent("content");
        record.setId(10);
        record.setTimeStamp(new Date());
        record.setOwner("naveen");
        System.out.println(record.toString());


    }
}
