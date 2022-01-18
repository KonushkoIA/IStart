public interface IStart {
    boolean startSystemCheck();
    void engineStart() throws InterruptedException;
    void start();
}
