package controlStatements.looping;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i ==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Rest of the code outside of loop but inside the method");
        return;
    }
}
