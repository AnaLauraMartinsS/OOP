public class Main {
    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        c.reagir("ola");
        c.reagir("vai apanhar");
        c.reagir(11, 40);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);

    }
}