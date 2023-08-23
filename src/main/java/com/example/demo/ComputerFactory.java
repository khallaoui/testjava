package com.example.demo;

public class ComputerFactory {
    public static Computer getComputer (ComputerAbstractFactory factory){
        return factory.createComputer();
}
}