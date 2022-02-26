package array;

public class Array {
    int array[];
    int size=0;
    public Array(int sizeOfArray) {
        this.array = new int[sizeOfArray];
        for (int index = 0; index < array.length; index++) {
            array[index] = Integer.MIN_VALUE;
        }
    }

    void insertElement(int value, int location) {
        if(array[location] ==Integer.MIN_VALUE){
            array[location] = value;
            size++;
        }
    }
    void traverse(){
        for (int i = 0; i < size ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
