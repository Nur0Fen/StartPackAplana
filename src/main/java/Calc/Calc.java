package Calc;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Calc {

    double a = 4;
    double b = 2;
    double result;
    int oper;

    public void getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи первое число ");
        try {
            a = input.nextDouble();
        }
        catch (InputMismatchException e) {
            throw new InputMismatchException("Ошибка ввода!Неверный формат данных");
        } catch (NullPointerException e) {
            throw new NullPointerException("Ошибка ввода!Неверный формат данных");
        }
        System.out.println("Выберите операцию 1-sum, 2-minus, 3-multiply, 4-devide");
        try {
            oper = input.nextInt();
        }
         catch (InputMismatchException e) {
        throw new InputMismatchException("Ошибка ввода!Неверный формат данных");
        } catch (NullPointerException e) {
        throw new NullPointerException("Ошибка ввода!Неверный формат данных");
        }

        System.out.println("Введи второе число ");
        try {
            b = input.nextDouble();
        }
        catch (InputMismatchException e) {
            throw new InputMismatchException("Ошибка ввода!Неверный формат данных");
        } catch (NullPointerException e) {
            throw new NullPointerException("Ошибка ввода!Неверный формат данных");
        }
        input.close();
    }

    public double sum() {
        result=a + b;
        System.out.println(result);
        return result;
    }


    public double minus() {
        result=a - b;
        System.out.println(result);
        return result;
    }


    public double divide() {
        if (b == 0)
            System.out.println("Деление на ноль невозможно!");
        else
        result=a / b;
        System.out.println(result);
        return result;
    }


    public double multiply() {
        result=a * b;
        System.out.println(result);
        return result;
    }
}