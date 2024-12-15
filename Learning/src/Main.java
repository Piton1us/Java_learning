import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        String num = scan.nextLine();
//        //.equals() проверяет на равенство
//        if(num.equals("Admin")){
//            System.out.println("Ваше число: " + num + " больше 10");
//        } else{
//            System.out.println("Ваше число: " + num + " Меньше 10");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int num2 = scanner.nextInt();
//
//        System.out.print("Введите действие: ");
//        String des = scanner.nextLine();
//        des = scanner.nextLine();
//        int res;
//
//        switch (des){
//            case "+":
//                res = num1 + num2;
//                System.out.println("Result = " + res);
//                break;
//            case "-":
//                res = num1 - num2;
//                System.out.println("Result = " + res);
//                break;
//            case "*":
//                res = num1 * num2;
//                System.out.println("Result = " + res);
//                break;
//            case "/":
//                res = num1 / num2;
//                System.out.println("Result = " + res);
//                break;
//            default:
//                System.out.println("idi na[et");


//        }
        /////////////////////////////////////////////////////////////////////////////////////
        //Седьмой урок: циклы и операторы в них.

//        for(int i = 0; i <= 10; i++){
//           System.out.println(i);
//        }
//        int i = 0;
//        while(i < 10){
//            System.out.println(i);
//            i++;
//        }
        /////////////////////////////////////////////////////////////////////////////////////
        //Восьмой урок: циклы и операторы в них.

//        int[] nums = new int[5];
//        nums[0] = 32;
//        nums[1] = 31;
//        nums[2] = 30;
//        nums[3] = 29;
//        nums[4] = 28;
//        int res = nums[0] + nums[1];
//        System.out.println(res);
//
//        float[] nums2 = new float[] {5.0f,3.0f,1.33f};
//        System.out.println(nums2[1]);
//
//        for (int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }
//        //Сокращенный вид
////        for (int num : nums) {
////            System.out.println(num);
////        }

//        int[] arr = new int[4];
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < arr.length; i++ ){
//            System.out.print("Введите число: ");
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//
//        int min = arr[0];// поиск минимума из массива
//        for (int i = 0; i < arr.length; i++){
//            if(arr[i] < min){
//                min =  arr[i];
//            }
//        }
//        System.out.println(min);
        /////////////////////////////////////////////////////////////////////////////////////
        //Девятый урок: Коллекции в Java.
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(10);
//
//        numbers.add(1,3);//Вставка в нужное место
//        System.out.println(numbers.get(1));//Получение определённого индекса
//
//        System.out.println(numbers.size());// Размерность Коллекции
//        numbers.remove(1);//Удаление элемента по индексу
//
//        for (Integer el : numbers){
//            System.out.println(el);
//        }

//        LinkedList<Integer> numbers = new LinkedList<>();//Более оптимизирован для добавления и удаления элементов
//        numbers.add(123);
//        numbers.add(12323123);
//
//        for (Integer el : numbers){
//            System.out.println(el);
//        }
/////////////////////////////////////////////////////////////////////////////////////
        //Десятый урок: функции в Java.

        //info("Chill guy");
//      int resultat = summa(1,9);
//      info("Результат : " + resultat);
/////////////////////////////////////////////////////////////////////////////////////
//        Двенадцатый урок и тренадцатый: Создание классов и объектов;

       // Car audi = new Car(230.5f,2500,"White",new int[] {0,0,0} );
        Truck maz = new Truck(2.5f,21500,false);

        maz.setValues(230.5f,2500,"White",new int[] {0,0,0} );
       System.out.println(maz.getValues());


















    }

//    public static int summa(int a,int b){
//        int res = a + b;
//        String result = "Результат: " + res;
//        info(result);
//        return  res;
//
//    }
//
//    public static void info(String word){
//
//        System.out.println(word);
//
//    }

}
