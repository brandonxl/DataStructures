package TwoPointers;

public class StringCompression443 {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int n = compress3(chars);
        System.out.println(n);
    }

    public static int compress(char[] chars) {

        int charLength = 1;
        int pointer1 = 0;
        int valueToReturn = 1;

        for (int pointer2 = 1; pointer2 < chars.length; pointer2++) {


            if (chars[pointer2] < chars.length && chars[pointer2] == chars[pointer2 - 1]) {
                valueToReturn++;
            }
            if (chars[pointer1] == chars[pointer2]) {
                charLength++;
            } else if (chars[pointer1] != chars[pointer2] && charLength <= 1) {
                pointer1 = pointer2;
                valueToReturn++;
            } else {
                chars[pointer2 - 1] = (char) (charLength + '0');
                charLength = 1;
                pointer1 = pointer2;
                valueToReturn++;
            }

            if (pointer2 == chars.length - 1) {
                chars[pointer1 + 1] = (char) (charLength + '0');
                valueToReturn++;
            }

        }
        return valueToReturn;
    }

    public static int compress2(char[] chars) {
        int write = 0;
        int count = 1;

        for (int read = 1; read <= chars.length; read++) {
            if (read < chars.length && chars[read] == chars[read - 1]) {
                count++;
            } else {
                chars[write] = chars[read - 1];
                write++;
                if (count > 1) {
                    String countStr = String.valueOf(count); //el valor count lo devuelve a String
                    for (char c : countStr.toCharArray()) {
                        chars[write] = c;
                        write++;
                    }
                }
                count = 1;
            }
        }
        return write;
    }


    public static int compress3(char[] chars) {
        int write = 0; // index where we'll write the compressed result
        int read = 0;  // index for reading the original array

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count how many times the current character repeats
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // If count > 1, write its digits
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }
        }

        return write; // new length of compressed array
    }

}
