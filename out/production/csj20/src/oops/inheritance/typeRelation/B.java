package oops.inheritance.typeRelation;

public class B extends A{
    int instanceVar = 200;
    void display(){
        System.out.println("Display B");
    }
    void sendMessage(String message){
        System.out.println("Sending message through WhatsApp");
    }

    public static void main(String[] args) {
        A ab = new B();// B IS-A A
        System.out.println(ab.instanceVar);//100
        ab.display();// Display B// Method overrdiing
        ab.sendMessage("Class is complete");

//        B ba = new A();//CTE
    }
}
