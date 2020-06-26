import java.util.ArrayList;

public class Knight implements HeroClass{

  private int HP;
  private int MP;
  private Inventory inventory;
  private ArrayList<Spells> spells;
  
  public Knight() {
    HP = 100;
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
    Spells stab = new Spells(1, 5);
    Spells block = new Spells(5, 8);
    Spells slash = new Spells(10, 10);
    Spells bash = new Spells(10, 5, "paralyze");
    ArrayList<Spells> spells = new ArrayList<Spells>();
    spells.add(stab);
    spells.add(block);
    spells.add(slash);
    spells.add(bash);
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
