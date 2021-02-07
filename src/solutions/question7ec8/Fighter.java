package solutions.question7ec8;

/** Represents a Fighting Fantasy fighter. */
public class Fighter {

  private static final int DAMAGE_VALUE = 2;

  private final String name;
  private final String type;
  private final int skill;
  private int stamina;
  private final GameEngine game;

  /** Creates a new fighter. */
  public Fighter(String name, String type, int skill, int stamina, GameEngine game) {
    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
    this.game = game;
  }

  /** Returns the fighter's name. */
  public String getName() {
    return name;
  }

  /** Reduces the fighter's stamina when taking damage. */
  public void takeDamage(int damage) {
    stamina = Math.max(stamina - damage, 0);
  }

  /** Returns the number of damage points to be inflicted on opponent. */
  public int calculateDamage() {
    return DAMAGE_VALUE;
  }

  /** Computes an attack score for a fighter. */
  public int calculateAttackScore() {
    final int d1 = game.rollDice();
    final int d2 = game.rollDice();
    return skill + d1 + d2;
  }

  /** Determines whether the fighter is still alive. */
  public boolean isDead() {
    return stamina == 0;
  }

  @Override
  public String toString() {
    return name + " - " + type + " - skill: " + skill + "; stamina: " + stamina;
  }
}
