package List.Arrays.demo;

import List.Arrays.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array =new int[]{4,5,6,8,2,0,0,4,3};
        System.out.println(Arrays.toString(array));
        Arrays.rotateArray(array,2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array,12));
        Arrays.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
