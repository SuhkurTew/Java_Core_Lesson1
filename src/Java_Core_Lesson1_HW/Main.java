package Java_Core_Lesson1_HW;

public class Main {

    public static void main(String[] args) {

        //Объявление перменных
        byte typeByte = 127;
        short typeShort = 32767;
        int typeInt = 2147483647;
        long typeLong = 9223372036854775807L;
        float typeFloat = 3.4e+38f;
        double typeDouble = 1.7e+308;
        char typeChar = 'z';
        boolean typeBoolean = false;
        String typeString = "Say hello to my little friend!!!";

        //Вычисление выражение a * (b + (c / d))
        System.out.println("Значение выражения = " + calculateExpression(2.0,4.0,1.0, 2.0));

        //Проверка диапазон 10 - 20
        System.out.println("Сумма принадлежит [10,20]? " + Range(2.0, 8.0));

        //Проверка числа на +-
        PlusMinus(0);

        //Проверка на отрицательность
        System.out.println("Число отрицательное? " + checkMinus(0));

        //Вызов приветствия
        Name("указанное_имя");

        //Проверка на високосный год
        LeapYear(2020);

    }

    //Вычисление выражения a * (b + (c / d))
    private static double calculateExpression(double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    //Проверка a и b и проверка, что их сумма лежит в пределах от 10 до 20(включительно)
    private static boolean Range(double a, double b){
        double sum = a + b;
        return (10<=sum && sum<=20) ? true : false;
    }

    //Проверка числа на +-
    private static void PlusMinus(int a){
        String str = a < 0 ? "отрицательное число " : "положительное число ";
        System.out.println("Передали " + str + "\"" + a + "\"");
    }

    //Проверка на отрицательность
    private static boolean checkMinus(int a){
        return a<0 ? true : false;
    }

    //Hello name!
    private static void Name(String name){
        System.out.println("Привет, " + name + "!");
    }

    //Проверка високосного года
    private static void LeapYear(int year){
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }
}