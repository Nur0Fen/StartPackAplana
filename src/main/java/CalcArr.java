import java.util.Scanner;
//коменты мы писать не бросим...
public class CalcArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;
        c = 0;

        System.out.println("Выберите задачу 1 - калькулятор, 0 - длинна слов массива");
        int ask = sc.nextInt();

   if (ask == 1) {
       System.out.println("Введите первое число");
       a = sc.nextDouble();

       System.out.println("Введите второе число");
       b = sc.nextDouble();

       System.out.println("Выберите операцию, введя соответствующую цифру:\n1-сложение, 2-вычитание, 3-умножение, 4-деление");
       int k = sc.nextInt();

       switch (k) {
           case 1:
               c = a + b;
               break;
           case 2:
               c = a - b;
               break;
           case 3:
               c = a * b;
               break;
           case 4:
               if (b == 0)
                   System.out.println("Деление на ноль невозможно!");
               else
                   c = a / b;
               break;
           default:
               System.out.println("Не знаем такого");
               break;
       }
       double hex = Math.pow(10, 4);
       System.out.println("Рeзультат операции" + " " + ((long) (c * hex)) / hex);
   }
    else if (ask == 0) {

       System.out.println("Введи какого размера будет массив???!");
       int o = sc.nextInt();

       String arr[] = new String[o];
       Scanner in = new Scanner(System.in);

       for (int i = 0; i < o; i++) {
           System.out.println("Введите следующую строку ");
           arr[i] = in.nextLine();
       }

       int max = arr[0].length();
       int maxi = 0;

       for (int i = 0; i < 5; i++) {
           if (arr[i].length() > max) {
               max = arr[i].length();
               maxi = i;
           }
       }

       System.out.println("Самое большое слово в массиве это " + arr[maxi] + " Оно состоит из " + max + " букв");
   }
    else {
       System.out.println("Не знаем такого");
   }

    }
}

