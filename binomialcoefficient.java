public class binomialcoefficient{
    public static int fac(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static int binfac(int n, int f){
        int fact_n=fac(n);
        int fact_f=fac(f);
        int fact_nmr=fac(n-f);
        int binfac=fact_n/(fact_f*fact_nmr);
        return binfac;
    }
    public static void main(String[] args) {
       System.out.println(binfac(5,2));
       System.out.println(binfac(12,2));

    }
}