package day5;

//https://www.geeksforgeeks.org/dsa/koko-eating-bananas/#expected-approach-binary-search-on-log-w-time-and-o1-space

public class KokoEatingBananas {

    public static boolean canEatAll(int[] piles, int h, int k) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += (pile + k - 1) / k; // Calculate hours needed for each pile
        }
        return hoursNeeded <= h; // Check if Koko can eat all bananas within h hours
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1; // Minimum eating speed
        int right = 0; // Maximum eating speed

        for (int pile : piles) {
            right = Math.max(right, pile); // The maximum speed is the size of the largest pile
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canEatAll(piles, h, mid)) {
                right = mid; // Try to find a smaller eating speed
            } else {
                left = mid + 1; // Increase the eating speed
            }
        }
        return left; // The minimum eating speed that allows Koko to eat all bananas in h hours
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int result = minEatingSpeed(piles, h);
        System.out.println("The minimum eating speed Koko needs is: " + result);
    }
    
}
