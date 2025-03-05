# Hangman Game in Java

## Overview
This is a simple command-line Hangman game implemented in Java. The game selects a random word from a predefined list, and the player has to guess the word by guessing individual letters. The player has a limited number of incorrect guesses before the game is lost.

## Features
- Random word selection from a predefined list.
- Player input validation to ensure only single letters are entered.
- Display of current game state with guessed letters and remaining attempts.
- Visual representation of the hangman as the game progresses.
- Win/Loss condition detection.

## How to Play
1. Run the program.
2. A random word will be selected, and its letters will be hidden.
3. The player guesses one letter at a time.
4. Correct guesses will reveal the letter(s) in the word.
5. Incorrect guesses will decrease the number of attempts and update the hangman drawing.
6. The game ends when the player either correctly guesses the word or runs out of attempts.

## Installation & Execution
### Prerequisites
- Java Development Kit (JDK) installed (Java 8 or later).

### Steps
1. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/hangman-java.git
   ```
2. Navigate to the project directory:
   ```sh
   cd hangman-java
   ```
3. Compile the Java files:
   ```sh
   javac *.java
   ```
4. Run the game:
   ```sh
   java HangMan
   ```

## File Structure
- `HangMan.java` - Main class that initializes and runs the game loop.
- `PlayerInput.java` - Handles user input and ensures valid input is received.
- `Rules.java` - Implements the game logic, processes guesses, and determines win/loss conditions.
- `Words.java` - Contains a list of words and selects a random word for each game.

## Contributors
- Juliana Pivaro
- Juliana Marques
- Deepika
- Rashmeet Kaur


Enjoy the game and happy coding!

