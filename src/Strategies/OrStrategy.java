package Strategies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NiGHTRiDER on 5/10/16.
 */
public class OrStrategy implements InterfaceStrategy{
  List<InterfaceStrategy> l;

  public OrStrategy(InterfaceStrategy... l) {
    this.l = new ArrayList<>();
    for(InterfaceStrategy is : l){
      this.l.add(is);
    }
  }

  @Override public boolean estValide(String mot) {
    for(InterfaceStrategy s : l){
      if(s.estValide(mot))return true;
    }
    return false;
  }
}
