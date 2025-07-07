import java.util.Scanner;
public class Number_Check{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        boolean found=false;
        int s=scan.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==s){
                System.out.println(i);
                found=true;
                break;
            }
           
        }
        if(!found){
            System.out.println(-1);
        }
    }


}