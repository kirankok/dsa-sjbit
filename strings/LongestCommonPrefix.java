public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        // Assume the first word is our complete baseline prefix
        String prefix = strs[0];
        
        // Compare our running prefix with every other word in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current word does NOT start with our running prefix...
            while (strs[i].indexOf(prefix) != 0) {
                // Chop the last character off the prefix string
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix gets chopped down to nothing, there is no common link
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] test = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(test)); // Outputs "fl"
    }
}