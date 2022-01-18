import java.util.Scanner;

public class Union1 implements IStart{


    @Override
    public boolean startSystemCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("В каком году был запущен Спутник-1? Введите число(погрешность 5 лет)");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Год запуска: 1957 " );
            return number < 1963 && number > 1951;
        } else {
            System.out.println("Это не число. Перезапустите программу и попробуйте снова!");
        }
        return false;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Спутник-1 запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Спутник-1");
    }
}
