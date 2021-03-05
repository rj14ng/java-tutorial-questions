package solutions.question8d24;

public class Main {

  public static void main(String[] args) {

    // Uses singleton pattern so it is not possible to create multiple game worlds
    final GameEngine gameEngine = GameEngine.getInstance();

    final LuckyFighter first =
        new LuckyFighter("Joe", "Human Warrior", 16, 12, 12, Strategy.AGGRESSIVE, gameEngine);
    final LuckyFighter second =
        new LuckyFighter("Alex", "Elf Lord", 18, 6, 11, Strategy.DEFENSIVE, gameEngine);

    gameEngine.simulateBattle(first, second);
  }
}
