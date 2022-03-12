package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductQueries {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Mobile", 10000);
        Product product2 = new Product(8, "Laptop", 100000);
        Product product3 = new Product(5, "Headphone", 23000);
        Product product4 = new Product(4, "Speaker", 6899);
        Product product5 = new Product(11, "Projector", 56987);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        // list of products with price > 50000
        List<Product> expensiveProducts = new ArrayList<>();
        for (Product p : products) {
            if (p.getProductPrice() > 50000) {
                expensiveProducts.add(p);
            }
        }
        System.out.println("Expensvie "+expensiveProducts);

        List<Product> collect = expensiveProducts.stream().filter(product -> product.getProductPrice() > 50000).collect(Collectors.toList());
        System.out.println(collect);
    }

}

