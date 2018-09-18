package Calc;

public class MainCalc {


    public static void main(String[] args) {

        Calc Calculate = new Calc();
        Calculate.getInput();
        switch (Calculate.oper) {
            case 1: {
                Calculate.sum();
                break;
            }
            case 2: {
                Calculate.minus();
                break;
            }
            case 3: {
                Calculate.multiply();
                break;
            }
            case 4: {
                Calculate.divide();
                break;
            }
            default:
                System.out.println("Я такого не знаю");
        }
    }
}