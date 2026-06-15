package day5;

//https://www.geeksforgeeks.org/dsa/allocate-minimum-number-pages/

public class AllocateMinimumPages {

    public static boolean isPossible(int[] arr, int students, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            } else {
                studentCount++;
                pageSum = arr[i];
            }
            if (studentCount > students) {
                return false;
            }
        }
        return true;
    }

    public static int allocateMinimumPages(int[] arr, int students) {
        int totalPages = 0;
        for (int num : arr) {
            totalPages += num;
        }

        int left = 0;
        int right = totalPages;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isPossible(arr, students, mid)) {
                result = mid; // Store the minimum number of pages
                right = mid - 1; // Try to find a smaller maximum
            } else {
                left = mid + 1; // Try to find a larger maximum
            }
        }
        return result; // Return the minimum number of pages that can be allocated
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int students = 2;
        int result = allocateMinimumPages(arr, students);
        System.out.println("The minimum number of pages allocated to a student is: " + result);
    }

    
    
}
