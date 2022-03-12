package collectionFramework;

import java.util.*;

public class ComparatorDemo {
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

        Comparator<Product> comparator = (p1, p2) -> p1.getProductPrice() - p2.getProductPrice();
        Collections.sort(products, (p1, p2) -> p1.getProductPrice() - p2.getProductPrice());
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("Sort products based on ID");
//        Collections.sort(products, Comparator.comparingInt(Product::getProductId));
//        Collections.sort(products, new ProductComparatorPrice());
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProductPrice() - o2.getProductPrice();
            }
        });
        for (Product p : products) {
            System.out.println(p);
        }

        // list of products with price > 50000
        List<Product> expensiveProducts = new ArrayList<>();
        for (Product p : products) {
            if (p.getProductPrice() > 50000) {
                expensiveProducts.add(p);
            }
        }
        System.out.println("Expensvie "+expensiveProducts);
    }

}

class ProductComparatorPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getProductPrice() - o2.getProductPrice();
    }
}