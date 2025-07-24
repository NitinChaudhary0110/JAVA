
    public class hollowrectangle {
    public static void hollowrectang(int row,int column){
         
             //outer loop
        for(int i=1;i<=row;i++){
             //inner loop
          for(int j=1;j<=column;j++){
            if(i==1||i==row||j==1||j==column){
                System.out.print("*");
            }
            else{
               System.out.print(" ");//single space
            }
            }    System.out.println();
        }
    }public static void main(String[] args){
        hollowrectang(4,5);
    }
}

    
