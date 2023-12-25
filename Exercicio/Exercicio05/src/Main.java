
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Carol");
        p1.setIdade(39);
        p1.setSexo('F');


        p2.setNome("Joana");
        p2.setIdade(30);
        p2.setSexo('F');


        p3.setNome("Dona");
        p3.setIdade(30);
        p3.setSexo('F');


        p4.setNome("Camila");
        p4.setIdade(30);
        p4.setSexo('F');


        p1.fazAniversario();
        p2.cancelarMatricula();
        p3.receberAumento(300f);
        p4.mudarTrabalho();


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}