public class Caneta {

    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //Métodos

    void status(){
        System.out.println("O modelo dessa caneta é: "+ this.modelo);
        System.out.println("A cor da caneta é: "+ this.cor);
        System.out.println("A ponta dela é: "+ this.ponta);
        System.out.println("A carga dela está em:"+ this.carga + "%");
        System.out.println("A caneta está tampada?"+ this.tampada);

    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Você não pode rabiscar a vontade");
        }else{
            System.out.println("Pode rabiscar");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
