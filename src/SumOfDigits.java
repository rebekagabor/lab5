public class SumOfDigits {
    public static void main(String[] args) {
        int input = 104;
        int result = getSumOfDigits(input);
        System.out.println("Input: " + input);
        System.out.println("Sum is: " + result);
    }

    public static int getSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;  // Adaugăm ultima cifră la sumă
            number /= 10;        // Eliminăm ultima cifră din număr
        }

        return sum;
    }
}
