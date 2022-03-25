package array;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int salaries[] = {
                97000, 123000, 156000,
                36000, 49800, 45000, 76000,
                191000, 10000
        };
        int sumOfSalaries = 0;
        for (int index = 0; index < salaries.length; index++) {
            sumOfSalaries = sumOfSalaries + salaries[index];
        }
        System.out.println("Sum of salaries "+sumOfSalaries);
        System.out.println("Average of Salaries "+sumOfSalaries/salaries.length);
    }
}
