public class SwapWithFunction {
    int a,b;

    public void swap(int a,int b){
       int result=a+b;
       b=result-b;
       a=result-a;
       System.out.println("a ="+a+" "+"b= "+b);

    }
    public static void main(String[] args) {
        SwapWithFunction obj=new SwapWithFunction();

        obj.swap(10,20);



    }
}
