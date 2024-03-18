import java.util.Scanner;

public class QuickSortSeq {
    private final double[] Q;
    public QuickSortSeq(int max){//Calculations in Constructor
        Q=new double[max+1];//Always solve recurrences like this without recursion
        Q[0]=0;
        double c=(double)(max+1)/max; //taking NCn=(N-1)Cn-1+2N
        for(int i=1;i<=max;i++)
            Q[i]=c*Q[i-1]+2;
    }
    public double eval(int n){
        return Q[n];
    }
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=rc.nextInt();
        QuickSortSeq Q = new QuickSortSeq(n);
        for(int i=0;i<n;i++)
            System.out.printf("%.5f\n",Q.eval(i));
        rc.close();
    }
}
