package com.forecasting;


import java.util.List;


public class ForecastService {



    public double calculateAverageGrowth(
            List<FinancialData> data){


        double totalGrowth = 0;


        for(int i = 1; i < data.size(); i++){


            double previous =
                    data.get(i-1).getRevenue();


            double current =
                    data.get(i).getRevenue();



            double growth =
                    ((current - previous) / previous) * 100;


            totalGrowth += growth;

        }


        return totalGrowth / (data.size()-1);

    }




    public double forecastNextYear(
            double lastRevenue,
            double growthRate){


        return lastRevenue +
                (lastRevenue * growthRate / 100);

    }


}