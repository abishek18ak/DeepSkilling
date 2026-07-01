package com.factory;


public class Main {


    public static void main(String[] args){


        Vehicle car = VehicleFactory.getVehicle("car");

        car.create();



        Vehicle bike = VehicleFactory.getVehicle("bike");

        bike.create();


    }

}