/*This class will randomly go over the array of words and it will choose one for the user to guess
 * Created by: Juliana on July 14th
 */
 import java.util.Random;

 public class Words {


    //Array storing the words used for Hangman
    private String [] wordList= {"programming", "java", "coffee","computer","study","game", "apple", "banana",
"read", "orange", "forest", "murderer", "summer","travel","home","glass","head","disney","heart","movie"};



    //This is retrieve a random word for the user to guess
    public String getRandomWord(){
        Random random = new Random();
        int index = random.nextInt(wordList.length); //genarates and index between 0 and the lenght of the array
        return wordList[index];
    }


   
}


