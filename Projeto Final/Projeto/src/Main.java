public class Main {
    public static void main(String[] args) {

        Video v[] = new Video[5];

        System.out.println("\n===== VIDEOS ======");
        v[0] = new Video("Programação Orientada a Objetos");
        v[1] = new Video("Conceitos de Polimorfismo");
        v[2] = new Video ("O que é um Objeto??");
        v[3] = new Video("Herança conceitos");
        v[4] = new Video ("Relacionamento de Agregação");

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(v[3].toString());
        System.out.println(v[4].toString());


        Espectador e[] = new Espectador[2];

        System.out.println("\n===== DADOS DO EXPECTADOR ====");
        e[0] = new Espectador("Ana", 23, "F", "aninhaZL");
        e[1] = new Espectador("Karmen", 16, "F", "karmenzita");

        System.out.println(v[0].toString());
        System.out.println(e[1].toString());

        System.out.println("\n===== VISUALIZAÇÃO =====");
        Visualizacao visual[] = new Visualizacao[5];
        visual[0] = new Visualizacao(e[0], v[2]);
        visual[0].avaliar(50.0f);

        System.out.println(visual[0].toString());
        visual[1] = new Visualizacao(e[1], v[3]);
        System.out.println(visual[1].toString());
        visual[1].avaliar(40.0f);
    }
}