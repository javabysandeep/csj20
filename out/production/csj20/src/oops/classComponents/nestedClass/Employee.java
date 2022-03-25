package oops.classComponents.nestedClass;

public class Employee {
    int employeeId = 300;

    public static void main(String[] args) {
        // local inner class.
        class LocalInnerClass {
            int instanceVar;
//            static int staticVar;//CTE

            void instanceMethod() {
                System.out.println("Local Inner class: Instance method");
            }

            //            static  void staticMethod(){}//CTE
            LocalInnerClass() {
                System.out.println("Local inner class con");
            }

            {
                System.out.println(" localinner class : instance block");
            }

            //            static {}//CTE
            class LocalInnerLocalInner {
            }
//            static class StaticCLass{}//CTE
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        int instanceVar = localInnerClass.instanceVar;
        localInnerClass.instanceMethod();

        //Inner class Access
        Employee employee = new Employee();
        InnerClass innerClass = employee.new InnerClass();
        innerClass.instanceMethodInner();
        System.out.println(innerClass.innerInstanceVar);

        //Nested static class
        Employee.NestedStaticClass.staticMethod();

        Employee.NestedStaticClass nestedStaticClass = new NestedStaticClass();
        nestedStaticClass.instanceMethod();

    }

    // nested inner class
    class InnerClass {
        int innerInstanceVar = 300;

        //        static int staticVar=100;//CTE
//        static{}//CTE
//        static void m1(){}//CTE
        void instanceMethodInner() {
            System.out.println("instanceMethodInner");
        }
    }

    //nested static class
    static class NestedStaticClass {
        int iv1 = 10;
        static int staticVar = 10;
        void instanceMethod(){
            System.out.println("Nested static class instance method");
        }
        static void staticMethod(){
            System.out.println("Nested static class static method");
        }
        {}
        static{}

    }
}
