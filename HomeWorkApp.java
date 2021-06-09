package gk.hw1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords () {
        System.out.println("Orange \n" +
                "Banana \n" +
                "Apple \n");          //понравился такой вариант больше, чем просто 3 строки
        }
        public static void checkSumSign(){
        int a=8,b=-85;
        int c=a+b;
        if (c>=0){
         System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
        }
    public static void printColor() {
        int value;
        value = -5;
        if (value >= 100) {
            System.out.println("Зеленый");
        } else if (value > 0) {
            System.out.println("Желтый");
        } else
            System.out.println("Красный");
    }

    public static void compareNumbers(){
            int a=-82, b=-7;
            if (a>=b) {
                System.out.println("a>=b");
            } else
                System.out.println("a<b");
        }
    }


