public class Main {
    public static void main(String[] args) {
        String input = "masina";
        String result = getMiddleCharacters(input);
        System.out.println("Input: " + input);
        System.out.println("Expected Output: " + result);
    }

    public static String getMiddleCharacters(String str) {
        int length = str.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            // Cuvantul are un numar par de litere
            return str.substring(middleIndex - 1, middleIndex + 1);
        } else {
            // Cuvantul are un numar impar de litere
            return str.substring(middleIndex, middleIndex + 1);
        }
    }
}
