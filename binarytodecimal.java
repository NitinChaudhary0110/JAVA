public class binarytodecimal{
    public static void bintodec(int binNum){
        int num=binNum;
        int pow=0;
        int deci =0;
        while(binNum>0){
            int lastdigit=binNum%10;
            deci=deci+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println(num+ "--> Decimal number is :"+deci);
    }public static void main(String[] args) {
        bintodec(110011);
    }
}