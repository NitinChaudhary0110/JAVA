public class invertedrotatehalfparamid {
    public static void inverotahalfparamid(int num){
        //outer loop
       for(int i=1;i<=num;i++){
        //space 
        for(int j=1;j<=(num-i);j++){
            System.out.print(" ");
        }
        //print star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }System.out.println();
       }
    }public static void main(String[]args){
        inverotahalfparamid(4);
    }
}
