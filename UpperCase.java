import java.util.Scanner;
class UpperCase{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        if(ch>='A'&& ch<='Z'){
            System.out.println((char)(ch+32));
        }
        else if(ch>='a' && ch<='z'){
            System.out.println((char)(ch-32));
        }
    }
}