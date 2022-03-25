package oops.finalKeyword;

public final class FinalDemo {
    public  static void main(String[] args) {
        final int var = 50;
//        var = 100;
        final FinalDemo finalDemo = new FinalDemo();
        FinalDemo finalDemo2 = new FinalDemo();
//        finalDemo = finalDemo2;
    }
     FinalDemo(){

    }

     {
        System.out.println("instance block");
    }

    final void display(){
        System.out.println("instance method");
    }

    final void display(int a){
        System.out.println("instance method");
    }
}
/*class B extends FinalDemo{
   *//* @Override
    void display() {
        super.display();
    }*//*
}*/
