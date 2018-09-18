package Calc;

import java.util.Scanner;


public class Calc {

    double a;
    double b;
    double result;
    int oper;

    public void getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи первое число ");
        a = input.nextDouble();
        System.out.println("Выберите операцию 1-sum, 2-minus, 3-multiply, 4-devide");
        oper = input.nextInt();
        System.out.println("Введи второе число ");
        b = input.nextDouble();
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