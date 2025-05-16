public class decimaltobinary {
    public static void dectobin(int n){
        int num=n;
        int power=0;
        int bin=0;
        while(n>0){
            int reminder =n%2;
            bin=bin+(reminder*(int)Math.pow(10,power));
            power++;
            n/=2;

        }System.out.println(num+ "--> Binary number is : "+bin);

    }public static void main(String[] args) {
        dectobin(19);
    }
}
