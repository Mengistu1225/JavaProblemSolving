import java.util.Scanner;

public class AddTwoNumberFromKeyBoard {
    public static void main(String[] args) {
        int a,b;
        Scanner  s1=new Scanner(System.in);
        System.out.println("enter a value : ");
        a=s1.nextInt();
        System.out.println("enter b value : ");
        b=s1.nextInt();
        int result=a+b;
        System.out.println(result);


    }
}
