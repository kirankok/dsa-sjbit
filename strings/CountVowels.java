public class CountVowels {
    public static int countVowels(String s) {
        int count = 0;
        String vowels = "aeiou";
        
        for (int i = 0; i < s.length(); i++) {
            // Convert character to lowercase for uniform checking
            char ch = Character.toLowerCase(s.charAt(i));
            
            // If the character is found inside the "aeiou" string, increment count
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels in \"" + str + "\": " + vowelCount);
    }
}