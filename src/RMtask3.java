import java.util.Scanner;

public class RMtask3 {
    public static void main(String[] args) {
        //Параметирине бир соз алып, ал создун бардык символдорун
        // тескери тартипте басып чыгарган метод жазыңыз.
        // example: input: laptop
        // output: potpal
        Scanner scanner=new Scanner(System.in);
        String soy= scanner.nextLine();
        ex3(soy);
    }
    public static void ex3(String soz){
        char [] a=soz.toCharArray( );
        for (int i =  a.length-1; i>=0; i--) {
            System.out.print(a[i]+ " ");

        }
    }
}
