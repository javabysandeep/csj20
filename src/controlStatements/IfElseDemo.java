package controlStatements;

public class IfElseDemo {
    public static void main(String[] args) {

        //1. as a condition to the if, we can provide direct true or false
        //2. expression which results into boolean
        //3. method call which results into boolean

        if (4 < 3) {
            System.out.println("If the condition is true");
        }
//        System.out.println("Indepedenct statements between if adnd else leads to CTE");
        else {
            System.out.println("Else block");
        }
        System.out.println("Rest of the code");

       /* if(23){

        }*/
    }

    private static boolean isElgible() {
        return false;
    }
}
