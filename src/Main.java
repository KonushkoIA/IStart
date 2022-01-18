public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cosmodrome cosmodrome = new Cosmodrome();
        Shuttle shuttle = new Shuttle();
        cosmodrome.launching(shuttle);
        Union1 union1 = new Union1();
        cosmodrome.launching(union1);
    }
}
