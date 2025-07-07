public class Array3{
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int index=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    arr[i][j]=Integer.parseInt(args[index]);
                    index++;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    System.out.print(arr[i][j]+" ");
                }
                 System.out.println();
        }
       
    }
}