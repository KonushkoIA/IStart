public class Shuttle implements IStart{

    @Override
    public boolean startSystemCheck() {
        int random = (int) (Math.random() * 10);
        System.out.println(random);
        return random > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт шатла");
    }
}
