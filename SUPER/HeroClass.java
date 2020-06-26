import java.util.ArrayList;

public interface HeroClass {
  
  public int getMP();
  
  public int getHP();
  
  public void gainHP(int hp);
  
  public void gainMP(int mp);
  
  public void loseHP(int hp);
  
  public void loseMP(int mp);
  
  public Inventory getItems();
  
  public ArrayList<Spells> setUpSpells();
  
  public void useItems(String potion);
}
