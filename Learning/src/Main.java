import java.security.KeyStore;
import java.util.Scanner;

public class Main {

    public static void  main(String[] args) {
//        Третий урок
//        System.out.println("Goida");

///////////////////////////////////////////////////////
//      Четвёртый урок: Переменные и типы данных

//        int age = 20;
//        System.out.println("Age: " + age + ".");

//          byte age = 1;
//          short num1 = 12;
//          int num2 = 123;
//          long num3 = 1234;

        // byte - от -128 до 127 и занимает 1 байт.
        // short - от -32768 до 32727, и занимает 2 байта.
        // int - от - -2147483648 до 2147483647 и занимает 4 байта.
        // long - от - -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт

//        float num4 = 4.323f;
//        double num5 = 3.123213d;
//
//        char ch = 'd';
//        String str = "based";
//
//        boolean isHappy = true;
// ///////////////////////////////////////////////////

        //Пятый урок: данные от пользователя и математические действия

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Name: ");

//        String userNAme =  scan.nextLine();
//        System.out.print("User name - " + userNAme);
//        int num1 = scan.nextInt();
//        boolean b = scan.nextBoolean();

//        short num1 = 50, num2 = 10;
//        int res = num1 + num2;
//
//        res += 10;
//        res ++;
//
//        System.out.print(res);
// ///////////////////////////////////////////////////

        //Шестой урок: условные конструкции
//        int a = 15, b = 10;
//        if(1 < 0 || a == b) {
//            System.out.println("Jo pa");
//        } else if(a > b) {
//            if(a > b){
//                System.out.println("Sosat");
//            }else{
//                System.out.println("Ne sosat");
//            }
//        }else{
//            System.out.println("Ne jo pa");
//        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();

        if(num > 10){
            System.out.println("Ваше число: " + num + " больше 10");
        } else{
            System.out.println("Ваше число: " + num + " Меньше 10");
        }

    }

}
