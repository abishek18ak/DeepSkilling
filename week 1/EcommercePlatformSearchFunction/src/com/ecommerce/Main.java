package com.ecommerce;



import java.util.List;



public class Main {


    public static void main(String[] args){


        ProductRepository repository = new ProductRepository();



        repository.addProduct(
            new Product(1,"Laptop","Electronics",75000)
        );


        repository.addProduct(
            new Product(2,"Mobile Phone","Electronics",30000)
        );


        repository.addProduct(
            new Product(3,"Shoes","Fashion",2500)
        );



        SearchService searchService = new SearchService();



        List<Product> result =
            searchService.searchByName(
                repository.getProducts(),
                "phone"
            );



        System.out.println("Search Results:");



        for(Product product : result){

            product.displayProduct();

        }


    }

}