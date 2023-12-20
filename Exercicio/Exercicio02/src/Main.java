public class Main {
    public static void main(String[] args) {

        //PRIMEIRA CONTA DE BANCO

        ContaBanco pessoa1 = new ContaBanco();
        //DEFINIÇÃO DE ATRIBUTOS
        pessoa1.setNumConta(123);
        pessoa1.setDono("Carol");
        pessoa1.abrirConta("Conta Corrente");
        pessoa1.depositar(300);
        pessoa1.fecharConta();


        //SEGUNDA CONTA DE BANCO
        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(1234);
        pessoa2.setDono("Camila");
        pessoa2.abrirConta("Conta Poupança");
        pessoa2.depositar(500);
        pessoa2.sacar(100);

        
        pessoa1.estadoAtual();
        pessoa2.estadoAtual();

    }
}