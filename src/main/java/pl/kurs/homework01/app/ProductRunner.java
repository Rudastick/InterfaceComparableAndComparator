package pl.kurs.homework01.app;

import pl.kurs.homework01.model.Product;

import java.time.LocalDate;
import java.util.Arrays;

public class ProductRunner {
    public static void main(String[] args) {
        Product product1 = new Product("Auto","Audi",13.41, LocalDate.of(2024,12,30),"Poland",3.12,21);
        Product product2 = new Product("Auto","Ziemia",13.41, LocalDate.of(2024,12,30),"Poland",3.12,23);
        Product product3 = new Product("Auto","Mama Malpy",5.41, LocalDate.of(2022,12,30),"Poland",3.12,0);
        Product product4 = new Product("Auto","Drzewo",2.41, LocalDate.of(2023,12,30),"Poland",3.12,13);
        Product product5 = new Product("Auto","Piekarz",0.41, LocalDate.of(2023,12,30),"Poland",1.12,11);

        Product[] products = {product1,product2,product3,product4,product5};
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("-------------------------");

        Arrays.sort(products);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
