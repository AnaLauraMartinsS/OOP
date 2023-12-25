
public class UFC {
    public static void main(String[] args) {
        //VETOR PARA A CRIANÇÃO DOS LUTADORES (0 A 5)

        Lutador L[] = new Lutador[6];

        L[0] = new Lutador("Billy Joe", "California", 51, 1.75f,
                68.9f, 2, 11, 1);

        L[1] = new Lutador("Ben Barlow", "Wrexham", 29, 1.68f,
                57.8f, 2, 14, 3);

        L[2] = new Lutador("Lucas Silveira", "Ceará", 40, 1.65f,
                80.9f, 2, 12, 1);

        L[3] = new Lutador("Parker Cannon", "Australia", 28, 1.93f,
                81.6f, 0, 13, 2 );

        L[4] = new Lutador("Lil Peep", "Pensilvânia", 21, 1.70f,
                119.3f, 4, 5, 3 );

        L[5] = new Lutador("Mario", "Floripa", 23, 1.75f,
                115.3f, 2, 6, 2 );

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(L[0], L[1]);
        UFC01.lutar();

    }
}