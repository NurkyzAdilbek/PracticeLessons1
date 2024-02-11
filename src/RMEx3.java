import java.util.Scanner;

public class RMEx3 {
    public static void main(String[] args) {
        //Параметирине үч сан алып ал сандардын арасынан эн
        // чонун кайтарган метод жазыңыз

        Scanner scanner=new Scanner(System.in);
        System.out.println("birinchi san: ");
        int a= scanner.nextInt();
        System.out.println("Ekinchi san: ");
        int  b= scanner.nextInt();
        System.out.println("Uchunchu san: ");
        int c= scanner.nextInt();
        System.out.println(getMax(a,b,c));
    }
    public static int getMax(int a, int b, int c){
        int max=Math.max(a,b);
        int max2=Math.max(max,c);
        return max2;
    }
}
