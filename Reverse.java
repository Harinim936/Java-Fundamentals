import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum*10+d;
            n=n/10;
        }
        System.out.println(sum);
    }}