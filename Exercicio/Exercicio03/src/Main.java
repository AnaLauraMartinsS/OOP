public class Main {
    public static void main(String[] args) {

        ControleRemoto c1 = new ControleRemoto(50, false, false);
        //c1.ligar();
        c1.aumentarVolume();
        c1.play();
        c1.abrirMenu();
        c1.fecharMenu();

    }
}