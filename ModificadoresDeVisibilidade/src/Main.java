// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo="Faber-Castell";
        c1.cor="Roxo";
        //c1.ponta=0.4f;
        c1.carga=80;
        //c1.tampada=false;
        c1.tampar();
        c1.rabiscar();

        c1.status();
    }
}
