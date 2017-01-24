/*
 * Esempi di gestione delle matrici di interi.
 */

package matrici;

import java.io.IOException;

/**
 *
 * @author Daniel
 */
public class Matrici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Matrice m = new Matrice(4, 6);
        
      
        m.fillRandom();
        
        System.out.println(m); 
       
        
        m.toFile("data/matrice.txt");
        
              
    }
    
}
