package hangman;

import java.util.Set;
import java.io.File;
import hangman.IEvilHangmanGame.GuessAlreadyMadeException;

public class EvilHangmanGame implements IEvilHangmanGame {

    public void Main(String args[]){
        String dictionaryFileName = args[0];
        int lengthOfWord = args[1];
        int guessesMade = args[2];
        if(lengthOfWord < 2 || guessesMade < 1){
            return null;
        }

    }

    public void startGame(File dictionary, int wordLength){

    }

    public Set<String> makeGuess(char guess) throws GuessAlreadyMadeException{

    }

}
