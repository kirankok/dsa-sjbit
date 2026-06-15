package day5;

public class FirstAndLastOccurence {

    //FirstAndLastOccurence binary search sorted array
    public static int firstOccurence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Store the index of the target element
                right = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return result; // Return the index of the first occurrence or -1 if not found
    }

    public static int lastOccurence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Store the index of the target element
                left = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return result; // Return the index of the last occurrence or -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5};
        int target = 2;
        int firstIndex = firstOccurence(arr, target);
        int lastIndex = lastOccurence(arr, target);

        if (firstIndex != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstIndex);
            System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
}
