import java.util.Scanner;
public class Alphabet{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        char ch1=scan.next().charAt(0);
        if(ch<ch1){
            System.out.println(ch+","+ch1);
        }
        else{
            System.out.println(ch1+","+ch);
        } 
    }
}