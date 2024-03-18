public class TowerOfHanoi {

    public static void main(String[] args) {
        int numberOfDisks = 10; // Change the number of disks as needed
        solveTowerOfHanoi(numberOfDisks, 'A', 'B', 'C');
    }

    public static void solveTowerOfHanoi(int n, char fromRod, char auxRod, char toRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        solveTowerOfHanoi(n - 1, fromRod, toRod, auxRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        solveTowerOfHanoi(n - 1, auxRod, fromRod, toRod);
    }
}
