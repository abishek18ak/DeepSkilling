package com.forecasting;


public class FinancialData {


    private int year;
    private double revenue;


    public FinancialData(int year, double revenue){

        this.year = year;
        this.revenue = revenue;

    }


    public int getYear(){

        return year;

    }


    public double getRevenue(){

        return revenue;

    }


}