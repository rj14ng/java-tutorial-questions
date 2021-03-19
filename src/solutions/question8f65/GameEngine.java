package solutions.question8f65;

import java.util.Random;

/** Represents a singleton game world. */
public class GameEngine {

  private static GameEngine SINGLE_INSTANCE;

  private final Random generator;

  /** Creates a new game engine. */
  private GameEngine() {
    generator = new Random();
  }

  /** Creates an instance of the singleton game engine. */
  public static GameEngine getInstance() {
    if (SINGLE_INSTANCE == null) {
      SINGLE_INSTANCE = new GameEngine();
    }

    return SINGLE_INSTANCE;
  }

  /** Rolls a dice to get a number from 1 to 6, inclusive. */
  public int rollDice() {
    return generator.nextInt(6) + 1;
  }

  /** Simulates a battle between two fighters, displaying how it progresses and who wins. */
  public void simulateBattle(Fighter first, Fighter second) {

    System.out.println("At start of battle, stats are:");
    System.out.println(first);
    System.out.println(second);
    System.out.println("------------------------------");

    while (true) {

      int firstAttackScore = first.calculateAttackScore();
      int secondAttackScore = second.calculateAttackScore();

      // Draw
      if (firstAttackScore == secondAttackScore) {
        System.out.println(first.getName() + " draws with " + second.getName());
        System.out.println("------------------------------");
      }
      // Someone wins the round
      else {

        Fighter winner;
        Fighter loser;

        if (firstAttackScore > secondAttackScore) {
          winner = first;
          loser = second;
        } else {
          winner = second;
          loser = first;
        }

        loser.takeDamage(winner.calculateDamage());

        System.out.println(winner.getName() + " hits " + loser.getName() + ", stats are:");
        System.out.println(first);
        System.out.println(second);
        System.out.println("------------------------------");

        if (loser.isDead()) {
          System.out.println("End of battle, " + winner + " wins!");
          return;
        }
      }
    }
  }
}
