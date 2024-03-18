public class CatalanNumbers {

    public static void main(String[] args) {
        int n = 5; // Calculate the 5th Catalan number
        long catalanNumber = calculateCatalan(n);
        System.out.println("The " + n + "th Catalan number is: " + catalanNumber);
    }

    public static long calculateCatalan(int n) {
        if (n <= 1) {
            return 1;
        }

        long[] catalan = new long[n + 1];
        catalan[0] = 1;
        catalan[1] = 1;

        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }

        return catalan[n];
    }
}