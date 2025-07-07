public class Array2{
    public static void main(String[] args){
        int arr[][]=new int[2][2];
        int index=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=Integer.parseInt(args[index]);
                index++;
            }
        }
         for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}