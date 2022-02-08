package oops;

public class Product {
    int productId = 1;
    String productName = "Abc";
    float productPrice = 12.4f;
    static String companyName = "Cyber success";

    void registerProduct(){
        System.out.println("registering new product");
    }

    public static void main(String[] args) {
        //args is also local reference variable
        int a = 20;//local primitive var
        Product product = new Product(); // local reference variable
        System.out.println(product.productId);
        System.out.println(product.productName);
        System.out.println(product.productPrice);
        System.out.println(Product.companyName);
        product.registerProduct();
    }

}
