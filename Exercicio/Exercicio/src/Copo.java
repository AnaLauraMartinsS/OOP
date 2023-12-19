public class Copo {

    //Atributos

    String modelo;
    String cor;
    boolean tampa;
    boolean canudo;
    String marca;
    int carga;

    //Métodos

    void status(){
        System.out.println("O tipo dele é:"+ this.modelo);
        System.out.println("A cor é: "+ this.cor);
        System.out.println("Tem tampa?: "+ this.tampa);
        System.out.println("Possúi canudo?:"+ this.canudo);
        System.out.println("A marca é:"+ this.marca);
        System.out.println("A carga está em:"+ this.carga + "%");
        System.out.println("E está tampada?"+ this.tampa);
    }
    void tampada(){
        this.tampa = true;
    }
    void destampada(){
        this.tampa= false;
    }

    void cheio(){
        //this.carga= carga;
        //System.out.println("Está com " + this.carga + "%");

        if(carga > 0) {
            System.out.println("Vamos beber água pra não ter pedra no rim!");
        }else{
            System.out.println("Vamos ter pedra no rim :c");
        }
    }
    void vazio(){
        this.carga = carga;
        System.out.println("Está vazio meu chapa");
    }
}
