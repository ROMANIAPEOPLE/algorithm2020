package baseball.game;

import baseball.utils.Numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        GameSettings gameSettings = new GameSettings(scanner);
        GameManager gameManager;

        Numbers computer = gameSettings.generateComputerNumber();
        while (true) {
            Numbers user = gameSettings.userSelectedNumber();
            gameManager = new GameManager(computer, user);
            gameManager.printAndResult();
            if(gameManager.isGameClear()) {
                break;
            }
        }

    }
}
