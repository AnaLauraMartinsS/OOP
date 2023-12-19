// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        System.out.println("=====Um pouco sobre a caneta:=====");
        c1.cor ="Roxa";
        c1.ponta= 0.4f;
        c1.carga = 70;
        c1.modelo = "Faber-Castell";
        c1.tampar();
        c1.rabiscar();
        c1.status();


        System.out.println("Minha segunda caneta:");
        Caneta c2 = new Caneta();
        c2.rabiscar();
    }
}
