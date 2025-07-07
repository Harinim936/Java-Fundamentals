import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        int temp=n;
        while(temp>0){
            int d=temp%10;
            sum=sum*10+d;
            temp=temp/10;
        }
        if(sum==n){
             System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
            
        }
    }}