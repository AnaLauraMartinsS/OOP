
public class Main {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c1 = new Canguru();
        Cachorro c2 = new Cachorro();
        Cobra c3 = new Cobra();
        Tartaruga t = new Tartaruga();
        PeixeDourado p1 = new PeixeDourado();
        Arara a1 = new Arara();

        System.out.println("======== DADOS DO MAMÍFERO ========");
        m.setPeso(23.7f);
        m.setCorPelo("Caramelo");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        System.out.println("======== DADOS DO REPTIL ========");
        r.setPeso(2.6f);
        r.setCorEscama("Dourado");
        r.alimentar();
        r.locomover();
        r.emitirSom();

        System.out.println("======== DADOS DA AVE ========");
        a.setPeso(1.7f);
        a.fazNinho();
        a.alimentar();
        a.locomover();
        a.emitirSom();

        System.out.println("======== DADOS DO PEIXE ========");
        p.setPeso(0.300f);
        p.setCorEscama("Azul");
        p.soltarBolha();
        p.alimentar();
        p.locomover();
        p.emitirSom();

        System.out.println("======== DADOS DO CANGURU ========");
        c1.locomover();
        c1.usarBolsa();
        c1.alimentar();
        c1.locomover();
        c1.emitirSom();

        System.out.println("======== DADOS DO CACHORRO ========");
        c2.emitirSom();
        c2.alimentar();
        c2.locomover();

        System.out.println("======== DADOS DA COBRA ========");
        c3.alimentar();
        c3.locomover();
        c3.emitirSom();

        System.out.println("======== DADOS DA TARTARUGA ========");
        t.alimentar();
        t.locomover();
        t.emitirSom();

        System.out.println("======== DADOS DO PEIXE DOURADO ========");
        p1.alimentar();
        p1.locomover();
        p1.emitirSom();

        System.out.println("======== DADOS DA ARARA ========");
        a1.alimentar();
        a1.locomover();
        a1.emitirSom();

    }
}