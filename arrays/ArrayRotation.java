public class ArrayRotation {

    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d is greater than n

        // Create a temporary array to hold the rotated elements
        int[] temp = new int[n];

        // Copy the elements from the original array to the temporary array in rotated order
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + d) % n];
        }

        // Copy the rotated elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotateArray(arr, d);
        System.out.println("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
