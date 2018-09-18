public class Gift {

    public static class Candy {
        static double weight = 10.1;
        static double price = 34.2;
        static String name = "Конфета";
        static String color = "Желтый";

    }

    public static class JellyBean {
        static double weight = 120.5;
        static double price = 300;
        static String name = "Бобы";
        static String color = "Радужный";
    }

    public static class Etc {
        static double weight = 333.33;
        static double price = 444.44;
        static String name = "?";
        static String color = "Черный";
    }

    public static void main(String[] args) {

        double GiftWeight = 4*Candy.weight + 1*JellyBean.weight + 2*Etc.weight;
        System.out.println("Общий вес подарка: " + GiftWeight);

        double GiftPrice = 4*Candy.price + 1*JellyBean.weight + 2*Etc.weight;
        System.out.printf("Общая стоимость подарка: %.2f\n", GiftPrice);

        String GiftConsist  = "4 "+Candy.name + ", 1 упаковка " + JellyBean.name + ", 2 сюрприза "+Etc.name;
        System.out.println("В подарок входит набор конфет из: " + GiftConsist);
    }
}