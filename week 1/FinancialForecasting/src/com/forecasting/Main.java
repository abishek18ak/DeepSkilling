package com.forecasting;


import java.util.ArrayList;
import java.util.List;



public class Main {


    public static void main(String[] args){



        List<FinancialData> data =
                new ArrayList<>();


        data.add(
            new FinancialData(2021,50000)
        );


        data.add(
            new FinancialData(2022,60000)
        );


        data.add(
            new FinancialData(2023,75000)
        );



        ForecastService service =
                new ForecastService();



        double growth =
                service.calculateAverageGrowth(data);



        double forecast =
                service.forecastNextYear(
                        75000,
                        growth
                );



        System.out.println(
            "Average Growth Rate: "
            + growth + "%"
        );


        System.out.println(
            "Forecast Revenue 2024: "
            + forecast
        );

    }

}