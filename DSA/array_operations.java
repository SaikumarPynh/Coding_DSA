import java.util.Arrays;

 class ArrayOperations {
    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));
        for(int i:numbers){
            System.out.print(i+" ");
        }
        System.out.println();

        // Find the index of an element
        int elementToFind = 5;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == elementToFind) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Index of " + elementToFind + ": " + index);
        } else {
            System.out.println(elementToFind + " not found in the array.");
        }

        // Check if an element exists at a specific index
        int indexToCheck = 2;
        if (indexToCheck >= 0 && indexToCheck < numbers.length) {
            System.out.println("Element at index " + indexToCheck + ": " + numbers[indexToCheck]);
        } else {
            System.out.println("Invalid index: " + indexToCheck);
        }

        // Check the uniqueness of the array
        boolean isUnique = true;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (!isUnique) {
                break;
            }
        }
        if (isUnique) {
            System.out.println("The array contains unique elements.");
        } else {
            System.out.println("The array contains duplicate elements.");
        }

        // Convert the array to a string representation
        String arrayAsString = Arrays.toString(numbers);
        System.out.println("Array as a string: " + arrayAsString);
    }
}
