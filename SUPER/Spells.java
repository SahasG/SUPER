
public class Spells {
  
  private int mpUse;
  private int damage;
  private String status;
  
  public Spells(int mpUse, int damage) {
    this.mpUse = mpUse;
    this.damage = damage;
  }

  public Spells(int mpUse, int damage, String status) {
    this.mpUse = mpUse;
    this.damage = damage;
    this.status = status;
  }
  
  public int getMpUse() {
    return mpUse;
  }

  public void setMpUse(int mpUse) {
    this.mpUse = mpUse;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }
  
  //TODO: Figure out a algorithm to increase spell damage
  public void spellLevelUp() {
    
  }
  
  
  
}
