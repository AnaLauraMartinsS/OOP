public class Ave extends Animal{
    private String corPena;

    public void fazNinho(){
        System.out.println("Ninho construído.");
    }

    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave.");
    }
}
