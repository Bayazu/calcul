import java.util.Scanner;


public class calc {
    private static Scanner in = new Scanner(System.in);
    public static void main (String[] argsOriginal)
    {
        System.out.println("Какую операцию хотите выполнить? \n 1.Сложение \n 2.Вычитание \n 3.Умножение \n 4.Деление");
        int num = in.nextInt();
    switch (num){
        case 1:
            System.out.println("Результат сложения " + sum());//сложение
        break;
        case 2:
            System.out.println("Результат вычитания " + sub());//вычитание
        break;
        case 3:
            System.out.println("Результат умножения " + mul());//умножение
        break;
        case 4:
            System.out.println("Результат деления " + div());//деление
        break;
        default: System.out.println("Что-то пошло не так");
        }
    }
    public static double sum(){
        System.out.println("Введите первое число");
        double x = in.nextDouble();
        System.out.println("Введите второе число");
        double y = in.nextDouble();
        in.close();
        return x + y;
    }
    public static double sub(){
        System.out.println("Введите первое число");
        double x = in.nextDouble();
        System.out.println("Введите второе число");
        double y = in.nextDouble();
        in.close();
        return x-y;
    }
    public static double mul(){
        System.out.println("Введите первое число");
        double x = in.nextDouble();
        System.out.println("Введите второе число");
        double y = in.nextDouble();
        in.close();
        return x*y;
    }
    public static double div(){
        System.out.println("Введите первое число");
        double x = in.nextDouble();
        System.out.println("Введите второе число");
        double y = in.nextDouble();
        in.close();
        return x/y;
    }
}
