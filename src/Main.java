import java.io.IOException;

import Strategies.CompteurStrategy;
import Strategies.InterfaceStrategy;
import Strategies.PalindromeStrategy;

/**
 * Created by NiGHTRiDER on 5/10/16.
 */
public class Main {

  public static void main(String[] args) throws IOException {
    PalindromeStrategy pal = new PalindromeStrategy();

    CompteurStrategy compteur = new CompteurStrategy(pal);
    new Context("fichier.txt").imprimerSi(compteur);
  }
}
