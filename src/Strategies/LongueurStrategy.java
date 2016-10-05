package Strategies;

import java.util.StringTokenizer;

/**
 * Created by NiGHTRiDER on 5/10/16.
 */
public class LongueurStrategy implements InterfaceStrategy{
  private final int longueur;

  public LongueurStrategy(int longueur){
    this.longueur = longueur;
  }

  @Override public boolean estValide(String mot) {
    return mot.length() == longueur;
  }
}
