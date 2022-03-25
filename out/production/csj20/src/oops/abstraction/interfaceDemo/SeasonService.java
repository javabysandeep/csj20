package oops.abstraction.interfaceDemo;

public interface SeasonService {
     int seasonId =100;

    void printSeasonDetails();

    public static void staticMethod() {
        System.out.println("static method from java8");
    }

    default void defaultMethod() {
        System.out.println("Default methods");
    }
   /* SeasonService(){
    }*/

    public static void main(String[] args) {
        System.out.println("Main method inside the interface");
        SeasonService.Feature feature = new Feature();
    }

     static class Feature{

    }
}
