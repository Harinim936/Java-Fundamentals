import java.util.Scanner;
public class SumOfDigits{
    public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int sum=0;
    for(int i=n;i>=0;i--){
        int d=n%10;
        sum+=d;
        n/=10;
    }
    System.out.println(sum);
}
}