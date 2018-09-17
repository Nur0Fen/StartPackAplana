import java.util.Scanner;

public class Summ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;
        c = 0;
        System.out.println("Введите первое число");
        a = sc.nextDouble();//Считываем первое число

        System.out.println("Введите второе число");
        b = sc.nextDouble();//Считываем второе число

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
}

