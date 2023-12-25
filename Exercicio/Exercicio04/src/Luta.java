import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado; //Tipo abstrato de dados, estou usando a classe Lutador.
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;


    //Metodos
    public void marcarLuta(Lutador L0, Lutador L1){
        if(L0.getCategoria().equals(L1.getCategoria())
        && L0 != L1){
            this.aprovado = true;
            this.desafiado = L0;
            this.desafiante = L1;
        }else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(this.aprovado){
            System.out.println("---- DESAFIADO ----");
            this.desafiado.apresentar();
            System.out.println("---- DESAFIANTE ----");
            this.desafiado.apresentar();

            Random escolha = new Random();
            int vencedor = escolha.nextInt(3);
            System.out.println("---- RESULTADO DA LUTA----");
            switch(vencedor){
                case 0: // empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println(this.desafiado.getNome() + " venceu a luta.");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println(this.desafiante.getNome() + " venceu a luta");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else {
            System.out.println("Impossível de ocorrer a luta.");
        }
    }

    //Get e set

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
