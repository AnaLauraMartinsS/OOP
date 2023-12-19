// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Copo copo1 = new Copo();
        //Chamada de atributos e dando valor a eles

        System.out.println("== Descripition ==");
        copo1.modelo="Copo";
        copo1.cor="Prata com glitter";
        copo1.canudo=true;
        copo1.marca="IBM";
        copo1.carga= 50;

        //Chamada de métodos

        copo1.cheio();
        copo1.tampada();
        copo1.status();

        //AGENDA

        Agenda A1 = new Agenda();
        //Atributos

        System.out.println("===Description===");
        A1.data = 16.12f;
        A1.hora = 06f;
        A1.local = "Terminal rodoviário";
        A1.convidados = "Carol, Camila";
        A1.desmarcar();
        A1.status();


    }
}