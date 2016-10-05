package Strategies;

import java.util.StringTokenizer;

/**
 * Created by NiGHTRiDER on 5/10/16.
 */
public class CommenceParTStrategy implements InterfaceStrategy {


  public CommenceParTStrategy() {

  }

  @Override public boolean estValide(String mot) {
    return mot.charAt(0) == 't';
  }
}
