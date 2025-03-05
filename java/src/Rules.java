/*This class holds the main rules of the game. How many attempts left, characters guessed,
 */

 public class Rules {


    //variables that will hold the world selected, the guesses for word and letters
    //and the attempts

    //it will hold the word that was selected in the words class
    private String wordToBeGuessed;


    //it will hold the guesses for the word (being right, wrong and not guesses yet)
    private char [] guessedWord;


    //this will hold the guesses (a-z) that have been already choosen by the player (true or false)
    private boolean[] guessedLetters;


    //this will tell how many attempts the user have left
    private int attemptsLeft;


    //constructor methodholding the word that is going to be guessed
    public Rules(String wordToBeGuessed) {
        this.wordToBeGuessed=wordToBeGuessed;


        //this will store the word to be guessed into an array of the same lenght. Each charcter into an index
        this.guessedWord=new char[wordToBeGuessed.length()];


        //this initialized every charcter og the guessed word as _ , menaing no letter have been guessed yet
        for (int i=0; i<guessedWord.length; i++) {
            guessedWord[i]= '_';
        }


        //this will initialize the guessed letter into an array of size 26(alphabet).
        //Everythinh will be false, meaning no letters have been guessed
        this.guessedLetters= new boolean[26];


        //this will initalize the attemps to guess the word to 7
        this.attemptsLeft=7;


    } //end of word to be guesses

    //This method processes the player's guessed letter. It performs the following steps:
    // it Converts the guessed letter to lowercase.
    //Checks if the letter has already been guessed using the guessedLetters array.
    //Marks the letter as guessed in the guessedLetters array.
    //Checks if the guessed letter is in the wordToGuess and updates the guessedWord array if it is.
    //Decreases the number of attempts left if the guess is incorrect and provides feedback to the player.


    public void processGuess (char guessedLetter){
        guessedLetter = Character.toLowerCase(guessedLetter);

        // determine the index for the guessed letter. 0 for a, 1 for b, etc..
        int letterIndex = guessedLetter - 'a';
       

        if (letterIndex>=0 && letterIndex<26 && guessedLetters[letterIndex]) {
            System.out.println("You have already guessed this letter");
            return;
        }


        if (letterIndex>=0 && letterIndex<26) {
            guessedLetters[letterIndex] = true;
           
        }
       
        //to check if the guess is correct
        boolean correctGuess = false;


        for (int i=0; i < wordToBeGuessed.length(); i++){
            //updates the guessedWord array with the guessed letter
            if (wordToBeGuessed.charAt(i) == guessedLetter){
                guessedWord[i] = guessedLetter;
                correctGuess = true;
            }
           
        }


   
        //if the guess was incorret, decrement the attempst left
        if (!correctGuess) {
            attemptsLeft--;
            System.out.println("Incorrect guess. Attempts remaining: " + attemptsLeft);
        } else {
            System.out.println("Good guess!");
    }
}

    //This method checks if the word has been completely guessed.
    //It goes through the guessedWord array and returns false if there are any underscores left.
    //If there are no underscores, it returns true.

//JULIA
    private boolean isWordGuessed() {
        for (char c : guessedWord) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }



    //This will print the word to be guessed array with space between the letters and how many attemtps left
    public void currentGame(){
        System.out.print("Word to guess: ");
        for (int i=0; i < guessedWord.length; i++) {
            System.out.print(guessedWord[i] + " ");
        }
            System.out.println("Attempts Left: "+attemptsLeft);
            printHangman(attemptsLeft);


    }


    //This method will check the attempts left and will print the hang man
    private void printHangman(int attemptsLeft) {
        switch (attemptsLeft) {
            case 7:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 6:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 5:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 4:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 3:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 2:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" /    |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 1:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 0:
                System.out.println(" ");
                break;
        }
    }






    //This method displays the final result of the game.
    //It prints a congratulatory message if the player guessed the word or
    //game over message if the player did not guess the word.


    public void displayFinalResult() {
        if (isWordGuessed()) {
            System.out.println("Congratulations! You guessed the word: " + wordToBeGuessed);
        } else {
            System.out.println("Game Over. The word was: " + wordToBeGuessed);
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println("______|");
            System.out.println(" /|\\  |");
            System.out.println(" / \\  |");
            System.out.println("      |");
            System.out.println("=========");
        }
    }




    //this will check if the game is over. If the user has 0 attempts left or if the word is guessed
    public boolean gameOver() {
        return attemptsLeft == 0 || isWordGuessed();


    }
   


}
