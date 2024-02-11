public class Quick_Sort_Performance {
    static double euler=0.577215665;
    public static void main(String[] args)
    {
        int maxN=Integer.parseInt(args[0]);
        double C[]=new double[maxN+1];
        C[0]=0;
        for(int N=1;N<=maxN;N++){
            C[N]=(N+1)*C[N-1]/N +2;
        }
        for(int N=10;N<=maxN;N*=10)
        {
            double approx = 2*N*Math.log(N)-2*(1-euler)*N;
            System.out.printf("%d\t\t%.5f\t\t%.5f\n", N,C[N],approx);
        }
    }
}
