public class Aluno extends Pessoa{
    private int Matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga "+ this.getNome());
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Matricula=" + Matricula +
                " curso='" + curso + '\'' +
                " nome= " + getNome() +
                " idade = "+ getIdade() +
                " sexo = "+ getSexo() +
                '}';
    }
}
