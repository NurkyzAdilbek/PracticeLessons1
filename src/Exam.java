import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        //Calculator Application Колдонуучу киргизүүнүн негизинде кошуу, кемитүү,
        // көбөйтүү жана бөлүү амалдарын аткара турган
        //  жөнөкөй калькулятор программасын түзүңүз.  Программа чексиз иштесин
        while (true) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("SAn beriniz");
        int a=scanner.nextInt();
        System.out.println("Die zweite Zahl");
        int b= scanner.nextInt();
        Scanner scannerSoz= new Scanner(System.in);
        System.out.println("WElche Operation");
        String operation= scannerSoz.nextLine();
        switch (operation) {
            case "Koshuu":
                System.out.println(a+" + "+ b+ " = " + (a+b));
                break;
            case "Minus":
                System.out.println(a+ " - "+ b+ " = "+ (a-b));
                break;
            case "Koboytuu":
                System.out.println(a+ " * "+ b+ " = "+(a*b));
                break;
            case "Boluu":
                System.out.println(a+ " / "+ b+ " = "+(a/b));
                break;
            default:
                System.out.println("Es gibt keine solche Operation");

        }


    }}
}
