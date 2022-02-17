package oops.polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        //vehicle.getVehicleDetails();//parent


        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.getVehicleDetails();//child


        //method overriding
        Vehicle vt = new TwoWheeler();
        vt.getVehicleDetails();//child


    }
}
