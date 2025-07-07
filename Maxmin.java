import java.util.Scanner;
public class Maxmin{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;              
            }
        }
        System.out.println("Max: "+temp);
        System.out.println("Min: "+arr[0]);
    }
}