public class Caneta {
    private String modelo;
    private float ponta;

    private String cor;

    private boolean tampada;

    //MÉTODO CONSTRUTOR
    public Caneta(String m, String c, float p){
        this.setPonta(p);
        this.setModelo(m);
        this.setCor(c);
        this.tampar();

    }
    public void status(){
        System.out.println("Sobre a caneta");
        System.out.println("O modelo da caneta é: "+ this.getModelo());
        System.out.println("A ponta dela é: "+ this.getPonta());
        System.out.println("A cor dela é: "+ this.cor);
        System.out.println("E ela está tampada? "+ this.tampada);
    }


    //MÉTODOS GET E SET


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void tampar(){

        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

}
