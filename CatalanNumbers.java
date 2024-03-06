public class CatalanNumbers {
    private int f[];
    Factorial(int n){
        f=new int[n+1];
        f[0]=1;f[1]=1;
        for(int i=2;i<=n;i++)
            f[i]=f[i-1]*i;
    }
    int eval(int n){
        return f[n];
    }
}
