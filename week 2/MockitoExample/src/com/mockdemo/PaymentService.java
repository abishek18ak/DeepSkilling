package com.mockdemo;


public class PaymentService {


    public boolean processPayment(double amount){

        if(amount > 0){

            return true;

        }

        return false;

    }

}
