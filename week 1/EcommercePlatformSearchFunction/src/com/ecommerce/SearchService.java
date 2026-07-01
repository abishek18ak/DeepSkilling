package com.ecommerce;


import java.util.List;
import java.util.stream.Collectors;



public class SearchService {



    public List<Product> searchByName(
            List<Product> products,
            String keyword){


        return products.stream()

                .filter(product ->
                    product.getName()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())
                )

                .collect(Collectors.toList());


    }


}