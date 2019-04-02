package Calc;

public class MainCalc {


    public static void main(double operand1, double operand2) {

        Calc Calculate = new Calc();
        Calculate.getInput();
        switch (Calculate.oper) {
            case 1: {
                Calculate.sum(operand1,operand2);
                break;
            }
            case 2: {
                Calculate.minus(operand1,operand2);
                break;
            }
            case 3: {
                Calculate.multiply(operand1,operand2);
                break;
            }
            case 4: {
                Calculate.divide(operand1,operand2);
                break;
            }
            default:
                System.out.println("Я такого не знаю");
        }
    }
}