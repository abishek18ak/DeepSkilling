package com.builder;


public class ComputerBuilder {


    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;



    public ComputerBuilder setCPU(String CPU){

        this.CPU = CPU;

        return this;

    }


    public ComputerBuilder setRAM(String RAM){

        this.RAM = RAM;

        return this;

    }


    public ComputerBuilder setStorage(String storage){

        this.storage = storage;

        return this;

    }


    public ComputerBuilder setGraphicsCard(String graphicsCard){

        this.graphicsCard = graphicsCard;

        return this;

    }



    public Computer build(){

        return new Computer(
                CPU,
                RAM,
                storage,
                graphicsCard
        );

    }

}