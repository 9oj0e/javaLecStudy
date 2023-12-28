package ex08.example;
// chatGPT 3.5
class coding {
    public static String encoding(String decodedData){
        StringBuilder encodedData = new StringBuilder();
        char currentChar = decodedData.charAt(0);
        // Takes the first character of the input string.
        int count = 1;
        // Initializes a count to keep track of the frequency of characters.
        for (int i = 1; i < decodedData.length(); i++) {
            // Starts a loop to iterate through the input string.
            char nextChar = decodedData.charAt(i);
            // Fetches the next character in the string.
            if (currentChar == nextChar)
                // Checks if the current character is equal to the next character.
                count++;
            // If the characters are the same, increments the count.
            else {
                // If the characters are different:
                encodedData.append(currentChar);
                // Appends the current character to the encoded data.
                encodedData.append(count);
                // Appends the count of the current character.
                currentChar = nextChar;
                // Updates the current character.
                count = 1;
                // Resets the count to 1 for the new character.
            }
        }
        encodedData.append(currentChar);
        // Appends the last character to the encoded data.
        encodedData.append(count);
        // Appends the count of the last character.
        return encodedData.toString();
        // Returns the final encoded string.
    }
    public static String decoding (String encodedData){
        StringBuilder decodedData = new StringBuilder();
        for (int i = 0; i < encodedData.length(); i += 2) {
            // Starts a loop to iterate through the encoded string.
            char character = encodedData.charAt(i);
            // Fetches the character at the current position.
            int count = Character.getNumericValue(encodedData.charAt(i + 1));
            // Fetches the count (as an integer) from the next character in the encoded string.
            for (int j = 0; j < count; j++) {
                // Starts a loop to repeat the character count times.
                decodedData.append(character);
                // Appends the character to the decoded data count times.
            }
        }
        return decodedData.toString();
        // Returns the final decoded string.
    }
}
public class StringEx01_3 {
    public static void main(String[] args) {
        String test1 = "AABBBCCCCDDDDDEEFFFFFGGHHHI";
        String A = coding.encoding(test1);

        String test2 = "A2B3C4D5E2F5G2H3I1";
        String B = coding.decoding(test2);

        System.out.println(A);
        System.out.println(B);
    }
}
