public class function {
    public static int sum(int a,int b){//formal parameters
        
        int add=a+b;//local variable
        return add;
    }

    public static void main(String[] args) {
        int a=10;
        int b=30;
        int calculate=sum(a,b);//actual parameters
        System.out.println("sum of two number is : "+calculate);
    }
}
