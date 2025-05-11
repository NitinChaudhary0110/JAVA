import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number : ");
        int a=sc.nextInt();
        System.out.println("enter second number : ");
        int b=sc.nextInt();

        //swap two number without using third variable :
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping first  number(a) is : "+a);
        System.out.println("after swapping second  number(b) is : "+b);

        sc.close();

        
    }
}
