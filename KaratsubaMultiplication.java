import java.math.BigInteger;
import java.util.Scanner;

public class KaratsubaMultiplication {

    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        System.out.println("Enter a number");
        BigInteger a = rc.nextBigInteger();
        System.out.println("Enter another number");
        BigInteger b = rc.nextBigInteger();
        rc.close();
        System.out.println(karatsuba(a, b));
        System.out.println(a.multiply(b));
    }

    public static BigInteger karatsuba(BigInteger x, BigInteger y) {
        // Base case for recursion
        if (x.compareTo(BigInteger.TEN) == -1 || y.compareTo(BigInteger.TEN) == -1) {
            return x.multiply(y);
        }

        // Calculate the number of digits of the numbers
        int n = Math.max(x.toString().length(), y.toString().length());
        int n2 = n / 2;

        // Split the numbers into two halves
        BigInteger[] partsX = split(x, n2);
        BigInteger[] partsY = split(y, n2);
        BigInteger high1 = partsX[0];
        BigInteger low1 = partsX[1];
        BigInteger high2 = partsY[0];
        BigInteger low2 = partsY[1];

        // Recursive steps
        BigInteger z0 = karatsuba(low1, low2);
        BigInteger z1 = karatsuba(low1.add(high1), low2.add(high2));
        BigInteger z2 = karatsuba(high1, high2);

        // Calculate the final result
        return z2.multiply(BigInteger.TEN.pow(2 * n2)).add(z1.subtract(z2).subtract(z0).multiply(BigInteger.TEN.pow(n2))).add(z0);
    }

    private static BigInteger[] split(BigInteger num, int n2) {
        BigInteger[] parts = new BigInteger[2];
        BigInteger[] divAndRem = num.divideAndRemainder(BigInteger.TEN.pow(n2));
        parts[0] = divAndRem[0];
        parts[1] = divAndRem[1];
        return parts;
    }
}
