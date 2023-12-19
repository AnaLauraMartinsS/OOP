public class Caneta {
    private String modelo;
    private float ponta;

    private String cor;

    private boolean tampada;

    //MÉTODO CONSTRUTOR
    public Caneta(String m, String c, float p){
        this.ponta=p;
        this.modelo = m;
        this.cor=c;
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

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

}
