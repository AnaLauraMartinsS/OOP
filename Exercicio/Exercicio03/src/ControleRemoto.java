public class ControleRemoto implements Controlador{
    // ATRIBUTOS

    private int volume;
    private boolean ligado;
    private boolean tocando;




    //METODOS ACESSORES


    public ControleRemoto(int volume, boolean ligado, boolean tocando) {
        this.volume = 50;
        this.ligado = true;
        this.tocando = true;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //SOBRESCRITA DOS MÉTODOS ABSTRATOS (UTILIZAÇÃO DO OVERRIDE)

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
            System.out.println("---- MENU ----");
            System.out.println("Ligado?" + this.getLigado());
            System.out.println("Está com volume?" + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print(" o ");
            }
    }
    @Override
    public void fecharMenu() {
        System.out.println("Menu fechado");
    }

    @Override
    public void aumentarVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossível realizar essa ação!");
        }
    }

    @Override
    public void diminuirVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() - 5);
        }else {
            System.out.println("Não é possível realizar essa ação!");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else {
            System.out.println("Impossível realizar essa ação!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else {
            System.out.println("Impossível realizar essa ação!");
        }
    }
}
