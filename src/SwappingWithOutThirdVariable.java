import java.util.Scanner;

public class SwappingWithOutThirdVariable {
    public static void main(String[] args) {
        int a,b;
        Scanner s2=new Scanner(System.in);
        System.out.println("enter a ");
        a=s2.nextInt();
        System.out.println("enter b :");
        b=s2.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= "+a+ " "+ "b ="+b);
    }
}
