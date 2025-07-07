import java.util.Scanner;
public class PercentInterest
{
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        String gender=scan.nextLine();
        int age=scan.nextInt();
        if(gender.equals("Female") && age>=1 && age<=58){
            System.out.println("8.2%");
        }
        else if(gender.equals("Male") && age>=1 && age<=58){
            System.out.println("8.4%");
        }
        else if(gender.equals("Female") && age>=59 && age<=100){
            System.out.println("9.2%");
        }
        else if(gender.equals("Male") && age>=59 && age<=100){
            System.out.println("10.5%");
        }
    }
}