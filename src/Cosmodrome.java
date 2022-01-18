import java.util.Timer;

public class Cosmodrome {

    public void launching(IStart st) throws InterruptedException {
        if (!st.startSystemCheck()){
            System.out.println("Предстартовая проверка провалена");
        } else {
            System.out.println("Предстартовая проверка пройдена");
            st.engineStart();
            for (int i = 10; i >= 0; i--) {
                System.out.println(i + "...");
                Thread.sleep(200);
            }
            st.start();
        }
    }
}
