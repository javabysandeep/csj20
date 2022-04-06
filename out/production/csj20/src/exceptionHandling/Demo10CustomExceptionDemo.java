package exceptionHandling;

public class Demo10CustomExceptionDemo {
    public static void main(String[] args) throws LateComerException {
        int time  = 9;
        if(time > 8){
            throw new LateComerException("You are late");
        } else{
            System.out.println("You are a good student !");
        }
    }
}
