package oops.accessSpecifier;

import oops.accessSpecifier.p1.A;

public class AccessSpeciferDemo {
    public static void main(String[] args) {
        A a  = new A();
//        System.out.println(a.instanceV1);//private
//        System.out.println(a.instanceV2); // default: same pkg
        System.out.println(a.instanceV3);
//        System.out.println(a.instanceV4);// protected: same pkg+child class
    }
}
