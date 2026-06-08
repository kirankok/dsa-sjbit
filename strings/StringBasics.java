public class StringBasics {

    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // Character at a specific index
        char charAt5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAt5);

        // Substring from index 0 to 5
        String substring = str.substring(0, 5);
        System.out.println("Substring (0-5): " + substring);

        // Convert to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperCaseStr);

        // Convert to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseStr);

        // Replace characters
        String replacedStr = str.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replacedStr);

        // Check if string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
    }
    
}
