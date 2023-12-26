public class Cachorro extends Lobo{

    public void emitirSom(){
        System.out.println("Latindo");
    }

    public void reagir(String frase){
        if(frase.equals("toma cuidado") || frase.equals("ola")){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }


    public void reagir(int hora, int minuto){
        if(hora < 12){
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("Ingnorado com sucesso");
        }else{
            System.out.println("Abanar e Latir");
        }
    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        }else {
            System.out.println("Rosnar e  Latir");
            this.emitirSom();
        }

    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                if (peso < 10) {
                    System.out.println("Rosnar");
                } else {
                    System.out.println("Ignorado com sucesso");
                }
            }
        }
    }
    public void reagir(float x, int y){

    }
}
