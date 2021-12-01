public class Attack {
  private String name;
  private int power;
  private int accuracy;
  private int pp;
  public Attack(String name, int pp, int power, int accuracy) {
    this.name = name;
    this.power = power;
    this.accuracy = accuracy;
    this.pp = pp;
  }

  public String getName() {
    return name;
  }

  public void changeAcc(int n) {
    accuracy += n;
  }

  public void doAttack() {
    pp--;
  }
}
