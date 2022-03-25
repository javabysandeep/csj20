package oops.inheritance;

public class Vehicle {
    protected int vehicleId;
    public String vehicleName;

    public Vehicle() {
        System.out.println("zero param parent con");
    }

    static {
        System.out.println("static block of parent");
    }
    {
        System.out.println("instance block of parent");
    }
}
