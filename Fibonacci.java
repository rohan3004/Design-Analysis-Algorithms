import java.util.*;
public class Fibonacci{
    private final long[] F;
    public Fibonacci(int max){//Calculations in Constructor
        F=new long[max+1];//Always solve recurrences like this without recursion
        F[0]=0;F[1]=1;
        for(int i=2;i<=max;i++)
            F[i]=F[i-1]+F[i-2];
    }
    public long eval(int n){
        return F[n];
    }
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=rc.nextInt();
        Fibonacci F = new Fibonacci(n);
        for(int i=0;i<n;i++)
            System.out.println(F.eval(i));
        rc.close();
    }
}