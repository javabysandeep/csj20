package oops.inheritance;

public class TwoWheeler extends Vehicle {
    public int numberOfWheels;

    TwoWheeler() {
        System.out.println("Child class zero param con");
    }

    static {
        System.out.println("child class static block");
    }

    {
        System.out.println("child class instance block");
    }


}
