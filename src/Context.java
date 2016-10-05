import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import Strategies.CompteurStrategy;
import Strategies.InterfaceStrategy;
import Strategies.PalindromeStrategy;

/**
 * Created by NiGHTRiDER on 5/10/16.
 */
public class Context {

  static String fichier;

  public Context(String fichier) {
    Context.fichier = fichier;
  }

  public void imprimerSi(CompteurStrategy cs) throws IOException {
    BufferedReader input = new BufferedReader(new FileReader(fichier)) ;
    String buffer = null;

    while ((buffer = input.readLine()) != null) {
      StringTokenizer mots = new StringTokenizer(buffer," \t.;(){}\"'*=:!/\\");
      while (mots.hasMoreTokens()) {
        String mot = mots.nextToken();
        if(cs.estValide(mot))
          System.out.println(mot);
      }
    }
    System.out.println("il y a eu " + cs.getCpt() + " mots valides");
  }

}
