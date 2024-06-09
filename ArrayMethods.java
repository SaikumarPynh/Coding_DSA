import java.util.Arrays;
import java.util.List;

public class ArrayMethods {
    public static void main(String[] args) {
        // Sorting Arrays
        int[] numbers = {5, 2, 8, 3, 1};
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));


        // Filling Arrays with specified number
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 10);
        System.out.println("Filled array: " + Arrays.toString(fillArray));

        // Binary Search in Arrays it will return the index of the element 
        int[] searchArray = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(searchArray, 3);
        System.out.println("Index of 3: " + index);

        // Copying Arrays
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // Comparing Arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Arrays are equal: " + areEqual);

        // Converting Arrays to List
        String[] words = {"apple", "banana", "cherry"};
        List<String> wordList = Arrays.asList(words);
        System.out.println("Array as list: " + wordList);
    }
}
