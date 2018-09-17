import java.util.Scanner;

public class Array4 {
    public static void main(String[]args){

        int max=10;
        int min =-10;
        int a=0;
        int b=0;

        //Генерим массив
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = ((int)(Math.random() * 21) - 10);
            System.out.println(array[i]);
        }

        for (int i = 0; i < 20; i++) {
            if (((array[i]) > min) & ((array[i])<0)) {
                min = array[i];
                a=i+1;
            }
            if (((array[i]) < max) & ((array[i])>0)) {
                max = array[i];
                b=i+1;
            }
        }

        System.out.println("Максимальный отрицательный элемент массива =" +min);
        System.out.println("Минимальный положительный элемент массива =" +max);

        int x=array[a-1];
        array[a-1]=array[b-1];
        array[b-1]=x;

        for (int i = 0; i < 20; i++) {
            System.out.println(array[i]);
        }
    }
}