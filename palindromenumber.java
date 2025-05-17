import java.util.*;
public class palindromenumber {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number : ");
    int n=sc.nextInt();
    palindrome(n);
    sc.close();

    

}public static void palindrome(int n){
    int original=n;
    int reverse=0;

    while(n>0){
        int lastdigit=n%10;
        reverse=reverse*10+lastdigit;
        n/=10;
    }if(original==reverse){
        System.out.println(original +"-->is a palindrome number .");
    }else{
        System.out.println(original + "-->is not a palindrome number .");
    }
}

    
}