
public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Kleberzinho");
        v1.setSexo("M");
        v1.setIdade(23);
        System.out.println(v1.toString());

        System.out.println("======================================");

        Aluno a1 = new Aluno();
        a1.setNome("Ana");
        a1.setIdade(23);
        a1.setSexo("F");
        a1.setMatricula(231324);
        a1.setCurso("TI");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        System.out.println("======================================");

        Bolsista b1 = new Bolsista();
        b1.setMatricula(12345);
        b1.setIdade(24);
        b1.setNome("Maria Joaquina");
        b1.setSexo("F");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        System.out.println(b1.toString());

    }
}