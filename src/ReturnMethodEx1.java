import java.util.Scanner;

public class ReturnMethodEx1 {
    public static void main(String[] args) {
        // Үч сандын орточо санын эсептөө
        // үчүн Java метод жазыңыз
        Scanner scanner=new Scanner(System.in);
        System.out.println("birinchi san: ");
       int a= scanner.nextInt();
        System.out.println("Ekinchi san: ");
      int  b= scanner.nextInt();
        System.out.println("Uchunchu san: ");
       int c= scanner.nextInt();
        double result=myMethod(a,b,c);
        System.out.println(result);
    } public static int myMethod(int a, int b, int c){
       int result=a+b+c;
       int  x= result/3;
       return x;
    }
}
