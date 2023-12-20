public class ContaBanco {

    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("====== INFORMAÇÕES DA CONTA ======");
        System.out.println("Conta = "+ this.getNumConta());
        System.out.println("Dono = "+this.getDono());
        System.out.println("Tipo da conta = "+ this.getTipo());
        System.out.println("Saldo = R$"+ this.getSaldo());
        System.out.println("Status = "+ this.getStatus());
    }

    //MÉTODOS

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(t == "Conta Corrente"){
            this.setSaldo(50);
        }else if(t == "Conta Poupança"){
            this.setSaldo(150);
        }
        System.out.println("Aberto com sucesso!!");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Não é possível, você ainda possuí saldo.");
        }else if(this.getSaldo() < 0){
            System.out.println("Impossível realizar está ação, você está em débito.");
        }else{
            this.setStatus(false);
            System.out.println("Conta fehcada com sucesso!");
        }
    }
    public void depositar(float valor){
        if(getStatus() == true){
            this.setSaldo(this.getSaldo()+ valor);
            System.out.println("Depósito realizado " + this.getDono());
        }else {
            System.out.println("Impossível fazer está ação!");
        }
    }
    public void sacar(float valor){
        if(this.getStatus() == true){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado " + this.getDono());
            }else {
                System.out.println("Saldo insuficiente!!");
            }
        } else {
            System.out.println("Não é possível fazer o saque");
        }
    }
    public void pagarMensalidade(){
        int valor = 0;
        if(this.getTipo() == "Conta Corrente"){
            valor = 12;
        } else if (this.getTipo() == "Conta Poupança"){
            valor = 20;
        }
        if(this.getStatus() == true){
            if(this.getSaldo() > valor ){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("De hoje ta pago!" + this.getDono());
            }else {
                System.out.println("Impossível realizar pagamento com conta fechada");
            }
        }else {
            System.out.println("Impossível pagar");
        }
    }

    //METODOS ESPECIAIS GET, SET E CONSTRUCTOR


    //CONSTRUCTOR
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
