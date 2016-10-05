package Strategies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NiGHTRiDER on 5/10/16.
 */
public class AndStrategy implements InterfaceStrategy {
  List<InterfaceStrategy> l;

  public AndStrategy(InterfaceStrategy... l) {
    this.l = new ArrayList<>();
    for(InterfaceStrategy is : l){
      this.l.add(is);
    }
  }

  @Override public boolean estValide(String mot) {
    for(InterfaceStrategy s : l){
      if(!s.estValide(mot))return false;
    }
    return true;
  }
}
