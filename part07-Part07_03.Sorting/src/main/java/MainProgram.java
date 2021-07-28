import java.lang.Math;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        for (int i : array) {
            smallest = Math.min(smallest, i);
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallestNumber = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestNumber) {
                return i;
            }
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = Integer.MAX_VALUE;
        int smallestIdx = -1;
        for (int i = startIndex; i < table.length; i++){
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, smallest, i);
        }
    }
}
