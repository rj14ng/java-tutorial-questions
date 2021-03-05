package solutions.question8d24;

/** Represents a Fighting Fantasy fighter with luck. */
public class LuckyFighter {

  private final String name;
  private final String type;
  private final int skill;
  private int stamina;
  private final int initialStamina;
  private int luck;
  private final Strategy strategy;
  private final GameEngine game;

  /** Creates a new fighter. */
  public LuckyFighter(
      String name,
      String type,
      int skill,
      int stamina,
      int luck,
      Strategy strategy,
      GameEngine game) {
    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
    this.initialStamina = stamina;
    this.luck = luck;
    this.strategy = strategy;
    this.game = game;
  }

  /** Returns the fighter's name. */
  public String getName() {
    return name;
  }

  /** Reduces the fighter's stamina when taking damage. */
  public void takeDamage(int damage) {

    final int AGGRESSIVE_RESISTANCE_THRESHOLD = 2;
    final int AVERAGE_RESISTANCE_THRESHOLD = initialStamina / 2;

    if (luck > 0) {
      if (strategy == Strategy.AVERAGE && stamina < AVERAGE_RESISTANCE_THRESHOLD
          || strategy == Strategy.AGGRESSIVE && stamina < AGGRESSIVE_RESISTANCE_THRESHOLD
          || strategy == Strategy.DEFENSIVE) {

        System.out.println(name + " tries to resist the damage...");

        if (testLuck()) {
          System.out.println("The damage is partially resisted!");
          damage--;
        } else {
          System.out.println("Oh no, the damage is even worse!");
          damage++;
        }
      }
    }

    stamina = Math.max(stamina - damage, 0);
  }

  /** Returns the number of damage points to be inflicted on opponent. */
  public int calculateDamage() {

    final int DAMAGE_VALUE = 2;
    final int AGGRESSIVE_MULTIPLIER = 2;
    final int MISS_PENALTY = 1;

    if (strategy == Strategy.AGGRESSIVE && luck > 0) {

      System.out.println(name + " goes for an aggressive hit...");

      if (testLuck()) {
        System.out.println("The hit is aggressive!");
        return DAMAGE_VALUE * AGGRESSIVE_MULTIPLIER;
      } else {
        System.out.println("The hit flounders.");
        return DAMAGE_VALUE - MISS_PENALTY;
      }
    }

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

  /** Tests the fighter's luck. */
  public boolean testLuck() {

    System.out.println(name + " tests luck...");

    if (luck == 0) {
      System.out.println(name + " is out of luck!");
      return false;
    }

    boolean result = game.rollDice() + game.rollDice() <= luck;
    luck--;
    System.out.println(name + " is " + (result ? "lucky" : "unlucky") + "!");
    return result;
  }

  @Override
  public String toString() {
    return name
        + " - "
        + strategy
        + " "
        + type
        + " - skill: "
        + skill
        + "; stamina: "
        + stamina
        + "; luck: "
        + luck;
  }
}
