package com.learn.ploymorphism;

public class InkPrinter extends Printer{
    @Override
    public void print(String data) {
        System.out.println("From Ink Printer: "+ data);
    }
}
