import java.util.Scanner;
class Large2{
public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    int temp=0;
    for(int i=0;i <n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println("1st Max: " + arr[0]);
    System.out.println("2nd Max: " + arr[1]);
    System.out.println("1st Smaller: " + temp);
    System.out.println("2nd Smaller: " + arr[n-2]);
}

}