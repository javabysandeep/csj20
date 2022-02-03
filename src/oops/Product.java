package oops;

public class Product {
    int productId;
    String productName;
    float productPrice;

    void registerProduct(){
        System.out.println("registering new product");
    }

    public static void main(String[] args) {
        int a = 20;
        Product product = new Product();
    }

}
