package ObjectsAndClasses_Lab_06;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        BigInteger sumOfNumber = firstNumber.add(secondNumber);

        System.out.println(sumOfNumber);
    }
}
