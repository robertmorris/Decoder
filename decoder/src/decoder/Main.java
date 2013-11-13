/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decoder;
import java.io.*;

public class Main {

      private static Loader loader;


    public static void main(String[] args) {

        FileReader pFile;

          try {
              pFile = new FileReader("DataFile2.txt");
              //pFile = new FileReader("/Users/mariax22/Desktop/DataFile2.txt");

              //load the program files
              loader = new Loader(pFile);

              try {
                  loader.load();
              } catch (IOException ioe) {
                  ioe.printStackTrace();
              }

          } catch ( FileNotFoundException fnfe ) {
              fnfe.printStackTrace();
          } catch ( IOException ioe ) {
              ioe.printStackTrace();
          }

    }

}