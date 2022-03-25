package p1;
 class Hello {
     static public  void main(String[] temp) {
        System.out.println("main method");
        display();
        C1.main(null);
    }
    static  void display(){
        System.out.println("User defined method");
    }
}

class C1{
     public static void main(String[] args) {
        System.out.println("C1 class main method");
    }
}
class C2{}
class C3{}
class C4{}
