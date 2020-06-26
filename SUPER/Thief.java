import java.util.ArrayList;

public class Thief implements HeroClass{

  private int HP;
  private int MP;
  private Inventory inventory;
  private ArrayList<Spells> spells;
  
  public Thief() {
    HP = 70;
    MP = 50;
    inventory = new Inventory();
    spells = setUpSpells();
  }
  
  @Override
  public int getMP() {
    // TODO Auto-generated method stub
    return MP;
  }

  @Override
  public int getHP() {
    // TODO Auto-generated method stub
    return HP;
  }

  @Override
  public void gainHP(int hp) {
    // TODO Auto-generated method stub
    this.HP = HP + hp;
  }

  @Override
  public void gainMP(int mp) {
    // TODO Auto-generated method stub
    this.MP = MP + mp;
  }

  @Override
  public void loseHP(int hp) {
    // TODO Auto-generated method stub
    this.HP = HP - hp;
  }

  @Override
  public void loseMP(int mp) {
    // TODO Auto-generated method stub
    this.MP = MP - mp;
  }

  @Override
  public Inventory getItems() {
    // TODO Auto-generated method stub
    return inventory;
  }

  @Override
  public ArrayList<Spells> setUpSpells() {
    Spells paralyze = new Spells(5, 0, "paralyze");
    Spells backstab = new Spells(10, 20, "bleed");
    Spells smokebomb = new Spells(10, 0, "invisibility");
    Spells kunai = new Spells(5, 10);
    ArrayList<Spells> spells = new ArrayList<Spells>();
    spells.add(paralyze);
    spells.add(backstab);
    spells.add(smokebomb);
    spells.add(kunai);
    return spells;
  }

  @Override
  public void useItems(String potion) {
    // TODO Auto-generated method stub
    if(potion.equals("HPotion")) {
      gainHP(50);
      if(HP > 100) {
        HP = 100;
      }
      
    }
    
    else if(potion.equals("MPotion")) {
      gainMP(50);
      if(MP > 100) {
        MP = 100;
      }
    }
  }
  
}
