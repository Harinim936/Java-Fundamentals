import java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;n>i;i++){
            arr[i]=scan.nextInt();
        }
        int sum=0;
        int avg=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            avg=sum/n;

        }
        System.out.println(sum);
        System.out.println(avg);
        
    }
}