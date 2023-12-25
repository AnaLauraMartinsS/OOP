public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa renovada "+ this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + "a sua bolsa foi paga");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                "nome = " + getNome() +
                " idade = "+ getIdade()+
                " sexo = "+ getSexo()+
                " bolsa=" + bolsa +
                '}';
    }
}
