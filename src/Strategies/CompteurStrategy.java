package Strategies;

/**
 * Created by NiGHTRiDER on 5/10/16.
 */
public class CompteurStrategy implements InterfaceStrategy{

  int cpt;
  InterfaceStrategy strategy;

  public CompteurStrategy(InterfaceStrategy strategy) {
    this.cpt = 0;
    this.strategy = strategy;
  }

  public int getCpt() {
    return cpt;
  }

  @Override public boolean estValide(String mot) {
    if(strategy.estValide(mot)){
      cpt++;
      return true;
    } else {
      return false;
    }
  }
}
