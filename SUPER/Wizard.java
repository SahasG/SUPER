import java.util.ArrayList;

public class Wizard implements HeroClass {

  private int HP;
  private int MP;
  private Inventory inventory;
  private ArrayList<Spells> spells;
  
  public Wizard() {
    HP = 60;
    MP = 100;
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
    if(HP > 100) {
      HP = 100;
    }
  }

  @Override
  public void gainMP(int mp) {
    // TODO Auto-generated method stub
    this.MP = MP + mp;
    if(MP > 100) {
      MP = 100;
    }
  }

  @Override
  public void loseHP(int hp) {
    // TODO Auto-generated method stub
    this.HP = HP - hp;
    if(HP < 0) {
      HP = 0;
    }
  }

  @Override
  public void loseMP(int mp) {
    // TODO Auto-generated method stub
    this.MP = MP - mp;
    if(MP < 0) {
      MP = 0;
    }
  }

  @Override
  public Inventory getItems() {
    // TODO Auto-generated method stub
    return inventory;
  }

  @Override
  public ArrayList<Spells> setUpSpells() {
    Spells fireball = new Spells(20, 20);
    Spells lightning = new Spells(10, 10);
    Spells heal = new Spells(20, 10, "heal");
    Spells freeze = new Spells(5, 5, "frozen");
    ArrayList<Spells> spells = new ArrayList<Spells>();
    spells.add(fireball);
    spells.add(lightning);
    spells.add(heal);
    spells.add(freeze);
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
