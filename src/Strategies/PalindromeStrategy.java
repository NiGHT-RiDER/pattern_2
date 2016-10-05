package Strategies;

import java.util.StringTokenizer;

/**
 * Created by NiGHTRiDER on 5/10/16.
 */
public class PalindromeStrategy implements InterfaceStrategy{

  public PalindromeStrategy() {

  }

  private boolean estPalindrome(String mot) {
    if (mot == null)
      return false;
    StringBuffer stringbuffer = new StringBuffer(mot);
    return mot.equals(stringbuffer.reverse().toString());
  }

  @Override public boolean estValide(String ligne) {
    return estPalindrome(ligne);
  }
}
