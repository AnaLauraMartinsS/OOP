public class Agenda {

    //Atributos
    float data;
    float hora;
    String local;
    String convidados;

    //Métodos

    void status(){
        System.out.println("O dia marcado: "+ this.data);
        System.out.println("A hora marcada: "+ this.hora +"H");
        System.out.println("O local marcado: "+ this.local);
        System.out.println("A pessoas convidadas: "+ this.convidados);
    }
    void marcar(){
        this.data = this.data;
    }
    void desmarcar(){
        if(data != 16){
            System.out.println("Terá que ser desmarcado");
        }else {
            System.out.println("Tá de pé o rolê");
        }
    }

}
