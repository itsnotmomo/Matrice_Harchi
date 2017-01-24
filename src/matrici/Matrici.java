package matrici;

import java.io.IOException;

/**
 *
 * @author harch
 */
public class Matrici {

    public static void main(String[] args) throws IOException {

        Matrice ma = new Matrice(2, 1);

        ma.fillRandom();

        System.out.println(ma);

        ma.toFile("data/risultato.txt");

    }

}
