import java.util.ArrayList;

public class UnionSortedArrays {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();
        // add your code here
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != arr1[i]) {
                    arr.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != arr2[j]) {
                    arr.add(arr2[j]);
                }
                j++;
            } else {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != arr1[i]) {
                    arr.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != arr1[i]) {
                arr.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != arr2[j]) {
                arr.add(arr2[j]);
            }
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(findUnion(arr1, arr2, 3, 5));
    }
}
