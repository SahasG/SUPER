
public class Inventory {
  
  private int healthPotions;
  
  private int manaPotions;
  
  public Inventory() {
    
    healthPotions = 0;
    manaPotions = 0;
    
  }

  public int getNumHealthPotions() {
    return healthPotions;
  }

  public void setNumHealthPotions(int healthPotions) {
    this.healthPotions = healthPotions;
  }

  public int getNumManaPotions() {
    return manaPotions;
  }

  public void setNumManaPotions(int manaPotions) {
    this.manaPotions = manaPotions;
  }
  
}
