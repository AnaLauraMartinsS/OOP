public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int derrotas;
    private int vitorias;
    private int empates;

    //Constructor (recebendo parâmentros), get e set
    public Lutador(String no, String na, int id, float al, float pe, int de, int vi, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setDerrotas(de);
        this.setVitorias(vi);
        this.setEmpates(em);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if (this.getPeso() < 52.2) {
            this.categoria = "INVÁLIDO, ABAIXO DO PESO";
        }else if(this.getPeso() <= 70.3){
            this.categoria ="LEVE";
        }else if(this.getPeso() <= 83.9){
            this.categoria = "MÉDIO";
        }else if(this.getPeso() <= 120.2){
            this.categoria = "PESADO";
        }else{
            this.categoria = "INVÁLIDO, ACIMA DO PESO";
        }
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Métodos

    public void apresentar(){
        System.out.println("---- LUTADOR ----");
        System.out.println("NOME: " + this.getNome());
        System.out.println("NACIONALIDADE: "+ this.getNacionalidade());
        System.out.println("IDADE: " + this.getIdade() + " ANOS");
        System.out.println("ALTURA: "+ this.getAltura() + " M");
        System.out.println("PESO: "+ this.getPeso() + " KG");
        System.out.println("VITORIAS: "+ this.getVitorias());
        System.out.println("DERROTAS: "+ this.getDerrotas());
        System.out.println("EMPATES: "+ this.getEmpates());
    }

    public void status(){
        System.out.println("---- STATUS ----");
        System.out.println(getNome());
        System.out.println("É PESO: "+ this.getCategoria());
        System.out.println(this.getVitorias() + " VITÓRIAS");
        System.out.println(this.getDerrotas() + " DERROTAS");
        System.out.println(this.getEmpates() + "EMPATES");
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() - 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
}
