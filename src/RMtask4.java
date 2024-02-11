import java.util.Scanner;

public class RMtask4 {
    public static void main(String[] args) {
// Бир метод тузунуз. Параметрине бир бутун сан жана бир соз
// алсын. Параметирине алган сан канчага барабар болсо,
// параметирине алган созду ошончо жолу консолго чыгарсын

        Scanner scanner=new Scanner(System.in);
        System.out.print("Kancha jolu chyksyn");
        int a= scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        System.out.print("Kaisy soz chyksyn");
        String soz= scanner1.nextLine();
        System.out.println(taks4(a,soz));
    }

    public static String taks4 (int a, String soz){
        for (int i=1; i<a; i++){
            System.out.print(soz+ "  ");
        }
        return soz;
    }
}
