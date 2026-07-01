package com.builder;


public class Main {


    public static void main(String[] args){


        Computer computer = new ComputerBuilder()

                .setCPU("Intel i7")

                .setRAM("16GB")

                .setStorage("512GB SSD")

                .setGraphicsCard("NVIDIA RTX")

                .build();



        computer.showDetails();


    }

}