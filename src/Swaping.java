import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a: ");
        a=s.nextInt();
        System.out.println("emter b: ");
        b=s.nextInt();
        System.out.println("a= "+a+" "+"b= "+b);

        c=a;
        a=b;
        b=c;
        System.out.println("a= "+a+"b= "+b);

    }
}
