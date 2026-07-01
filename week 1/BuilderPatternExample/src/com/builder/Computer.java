package com.builder;


public class Computer {


    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;


    public Computer(String CPU, String RAM, String storage, String graphicsCard) {

        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.graphicsCard = graphicsCard;

    }


    public void showDetails(){

        System.out.println("CPU : " + CPU);
        System.out.println("RAM : " + RAM);
        System.out.println("Storage : " + storage);
        System.out.println("Graphics Card : " + graphicsCard);

    }

}
