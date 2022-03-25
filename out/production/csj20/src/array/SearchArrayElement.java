package array;
//Linear Search
public class SearchArrayElement {
    public static void main(String[] args) {
        int salaries[] = {
                97000, 123000, 156000,
                36000, 49800, 45000, 76000,
                191000, 10000,145
        };
        int key = 145;
        for (int index = 0; index < salaries.length; index++) {
            if(salaries[index]==key){
                System.out.println("key is present at "+index);
                break;
            }
        }
    }
}
