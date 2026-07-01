package com.mockdemo;



public class Main {


    public static void main(String[] args){


        PaymentService payment =
                new PaymentService();



        Order order =
                new Order(payment);



        System.out.println(
                order.placeOrder(500)
        );


    }


}