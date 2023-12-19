public class Caneta {

    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    //Métodos

    public void status(){
        System.out.println("O modelo dessa caneta é: "+ this.modelo);
        System.out.println("A cor da caneta é: "+ this.cor);
        System.out.println("A ponta dela é: "+ this.ponta);
        System.out.println("A carga dela está em:"+ this.carga + "%");
        System.out.println("A caneta está tampada?"+ this.tampada);

    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("NÃO PODE RABISCAR");
        }else{
            System.out.println("PODE RABISCAR");
        }
    }

    public void tampar(){

        this.tampada = true;
    }

    public void destampar(){

        this.tampada = false;
    }
}
