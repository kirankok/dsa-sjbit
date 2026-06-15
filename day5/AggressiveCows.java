package day5;
//https://www.geeksforgeeks.org/dsa/assign-stalls-to-k-cows-to-maximize-the-minimum-distance-between-them/#expected-approach-using-binary-search
public class AggressiveCows {

    public static boolean canPlaceCows(int[] stalls, int cows, int distance) {
        int count = 1; // Place the first cow in the first stall
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= distance) {
                count++; // Place another cow
                lastPosition = stalls[i]; // Update the last position
            }
            if (count >= cows) {
                return true; // Successfully placed all cows
            }
        }
        return false; // Could not place all cows with the given distance
    }

    public static int aggressiveCows(int[] stalls, int cows) {
        java.util.Arrays.sort(stalls); // Sort the stall positions
        int left = 0; // Minimum distance
        int right = stalls[stalls.length - 1] - stalls[0]; // Maximum distance

        while (left < right) {
            int mid = left + (right - left) / 2; // Calculate the middle distance

            if (canPlaceCows(stalls, cows, mid)) {
                left = mid + 1; // Try for a larger distance
            } else {
                right = mid; // Try for a smaller distance
            }
        }
        return left - 1; // The largest minimum distance that can be achieved
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;
        int result = aggressiveCows(stalls, cows);
        System.out.println("The largest minimum distance between cows is: " + result);
    }
}
