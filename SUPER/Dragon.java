import java.util.ArrayList;
import java.util.Random;

public class Dragon implements EnemyClass{

  private int HP;
  private int damage;
  private String status;
  
  public Dragon() {
    HP = 10;
    damage = 10;
    status = null;
  }
  
  @Override
  public void loseHP(int hp) {
    // TODO Auto-generated method stub
    this.HP = HP - hp;
  }

  @Override
  public String dropItem() {
    // TODO Auto-generated method stub
    Random rand = new Random();
    
    int rand_int = rand.nextInt(10);
    
    if(rand_int >= 0 && rand_int < 2) {
      return "HPotion";
    }
    else if(rand_int >= 2 && rand_int < 4) {
      return "MPotion";
    }
    else
    {
      return "";
    }
  }

  @Override
  public void enemyLevelUp() {
    // TODO: figure out an algorithm to increase enemy difficulty
    
  }

  @Override
  public void inflictStatus(String status) {
    // TODO Auto-generated method stub
    Random rand = new Random();
  
    if(!this.status.equals(null)) {
      
    }
    else if(status.equals("paralyze")) {
      int rand_int1 = rand.nextInt(10);
      if(rand_int1 >= 0 && rand_int1 < 3) {
        this.status = status;
      }
    }
    else if(status.equals("frozen")) {
      int rand_int1 = rand.nextInt(10);
      if(rand_int1 >= 0 && rand_int1 < 3) {
        this.status = status;
      }
    }
    else if(status.equals("bleed")) {
      int rand_int1 = rand.nextInt(10);
      if(rand_int1 >= 0 && rand_int1 < 5) {
        this.status = status;
      }
    }
    
  }
}
