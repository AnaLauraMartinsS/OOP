
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Carol");
        p2.setNome("Joana");
        p3.setNome("Dona");
        p4.setNome("Camila");

        p1.fazAniversario();
        p2.cancelarMatricula();
        p3.receberAumento(300f);
        p4.mudarTrabalho();

        p1.setSexo("F");
        p4.setSexo("F");
        p2.setIdade(20);

        p2.setCurso("Artes visuais");
        p3.setSalario(2500.7f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}