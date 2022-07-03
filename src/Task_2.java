import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N(1≤N≤1018) [1,N]");
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int result = getIncreasePrimeNumbers(n);

        System.out.println("Result : " + getZerosCount(result));

    }

    private static int getZerosCount(int result) {
        int count = 0;
        while (result > 0) {
            if (result % 10 == 0) {
                count++;
            }
            result /= 10;
        }
        return count;
    }

    private static int getIncreasePrimeNumbers(int n) {
        boolean isPrime = true;
        int bank = 1;

        for (int i = 1; i <= n; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    System.out.println(i);
                }
            }
            if (isPrime) bank *= i;

        }
        System.out.println(bank);
        return bank;
    }
}
