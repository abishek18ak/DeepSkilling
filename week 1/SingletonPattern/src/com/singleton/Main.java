package com.singleton;


public class Main {


    public static void main(String[] args) {


        Logger logger1 = Logger.getInstance();


        Logger logger2 = Logger.getInstance();



        logger1.log("This is first logger");


        logger2.log("This is second logger");



        if(logger1 == logger2) {


            System.out.println("Both objects are same");


        } else {


            System.out.println("Different objects");


        }

    }

}

