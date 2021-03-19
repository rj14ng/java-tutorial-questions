package solutions.question8f65;

/** Represents a Fighting Fantasy fighter with luck. */
public class LuckyFighter extends Fighter {

  private final int initialStamina;
  private int luck;
  private final Strategy strategy;

  /** Creates a new fighter. */
  public LuckyFighter(
      String name,
      String type,
      int skill,
      int stamina,
      int luck,
      Strategy strategy,
      GameEngine game) {
    super(name, type, skill, stamina, game);
    this.initialStamina = stamina;
    this.luck = luck;
    this.strategy = strategy;
  }

  /** Reduces the fighter's stamina when taking damage. */
  @Override
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

    super.takeDamage(damage);
  }

  /** Returns the number of damage points to be inflicted on opponent. */
  @Override
  public int calculateDamage() {

    final int DAMAGE_VALUE = 2;
    final int AGGRESSIVE_MULTIPLIER = 2;
    final int MISS_PENALTY = 1;

    if (strategy == Strategy.AGGRESSIVE && luck > 0) {

      System.out.println(name + " goes for an aggressive hit...");

      if (testLuck()) {
        System.out.println("The hit is aggressive!");
        return super.calculateDamage() * AGGRESSIVE_MULTIPLIER;
      } else {
        System.out.println("The hit flounders.");
        return super.calculateDamage() - MISS_PENALTY;
      }
    }

    return super.calculateDamage();
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
