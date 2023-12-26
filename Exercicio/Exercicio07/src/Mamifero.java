public class Mamifero extends Animal{

    private String corPelo;


    @Override
    public void locomover() {
        System.out.println("Ele corre");
    }

    @Override
    public void alimentar() {
        System.out.println("No início da vida ele mama.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som emitido.");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
