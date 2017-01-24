package matrici;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Harch
 */
public class Matrice {

    int[][] theMatrix;

    public Matrice(int a, int b) {

        theMatrix = new int[a][b];
    }

    public Matrice(int[][] f) {
        theMatrix = f;
    }

    public Matrice(String filename) throws FileNotFoundException, IOException {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String u = br.readLine();
            System.out.println(u);
        } catch (FileNotFoundException ex) {

        }
    }

    public void fillRandom() {
        for (int i = 0; i < theMatrix.length; i++) {
            for (int j = 0; j < theMatrix[i].length; j++) {
                theMatrix[i][j] = (int) (Math.random() * 10);

            }
        }
    }

    @Override
    public String toString() {
        String st = "";
        for (int e = 0; e < theMatrix.length; e++) {
            for (int k = 0; k < theMatrix[e].length; k++) {
                theMatrix[e][k] = (int) (Math.random() * 10);
                st += theMatrix[e][k] + "\t";
            }
            st += "\n";

        }
        return st;
    }

    public void toFile(String filename) throws IOException {
        FileWriter out;
        try {
            out = new FileWriter("data/risultato.txt");
            out.write(this.toString());
            out.close();

        } catch (IOException ex) {
            System.out.println("Errore" + ex.getMessage());
        }
    }

    void fromFile(String filename) {
           //da completare
    }

}
