package oops.inheritance.p2;

import oops.inheritance.p1.Parent;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.gold);
//        System.out.println(child.silver);//CTE: diff pkg
    }
}
