package day5;

//https://www.geeksforgeeks.org/dsa/find-a-peak-in-a-given-array/
public class PeakElementinArray {

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid; // Move to the left half
            }
        }
        return left; // Return the index of a peak element
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);
        System.out.println("A peak element is at index: " + peakIndex + ", value: " + arr[peakIndex]);
    }
    
}
