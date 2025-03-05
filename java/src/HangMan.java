/* The HangMan class is the main class for running the Hangman game.
 * It initializes the word list, sets up the game state, handles player input,
 * and manages the game loop until the game is over.
 * Created by: Juliana Pivaro(200549834), Juliana Marques(200610604), Deepika(200597433), Rashmeet kaur (200597430)*/

public class HangMan {
    public static void main(String[] args) {
        Words wordList = new Words();
        String wordToGuess = wordList.getRandomWord();
       
        Rules gameState = new Rules(wordToGuess);
        PlayerInput inputHandler = new PlayerInput();
       
        while (!gameState.gameOver()) {
            gameState.currentGame();
            char guessedLetter = inputHandler.getUserInput();
            gameState.processGuess(guessedLetter);
        }
       
        gameState.displayFinalResult();
    }
}



