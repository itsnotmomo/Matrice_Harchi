/*
 * Matrice: una classe wrapper
 * per una matrice bidimensionale di interi.
 */

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
 * @author Daniel
 */
public class Matrice {
    
    int[][] theMatrix;
    
    // costruttore uno
    public Matrice(int x, int y) {
        // da completare
    theMatrix=new int[x][y];
    }
    
    // costruttore due
    public Matrice(int[][] m) {
        theMatrix = m;
    }
    
    public Matrice(String filename) throws FileNotFoundException, IOException{
        try{
            FileReader f = new FileReader(filename);
            BufferedReader bf = new BufferedReader(f);
            String s = bf.readLine();
            System.out.println(s);
        } catch (FileNotFoundException ex) {
            
        }
    }
    
    public void fillRandom() {
      for (int i = 0; i < theMatrix.length; i++) {
        for (int j = 0; j < theMatrix[i].length; j++) {
          theMatrix[i][j] = (int) (Math.random()*10);
          
  
        }
      }
    }

    @Override
    public String toString() {
        String s="";
        for (int i = 0; i < theMatrix.length; i++) {
        for (int j = 0; j < theMatrix[i].length; j++) {
          theMatrix[i][j] = (int) (Math.random()*10);
            s +=theMatrix[i][j]+"\t";  
        }
            s +="\n";
        
        }
        return s;
    }

    public void toFile( String filename ) throws IOException {
        FileWriter out;
        try{
        out = new FileWriter("data/matrice.txt");
        out.write(this.toString());
        out.close();
        
            
        }
        catch(IOException ex){
        System.out.println("Errore" + ex.getMessage());
        }
    }

    void fromFile( String filename )  {
        
    
       
        
       }
    
    
}


