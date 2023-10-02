package singleton;

/**
 * @author seannary
 */

import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

public class Game 
{
    private static Game game;
    private Random rand = new Random();
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams = new HashMap<Difficulty, ArrayList<Anagram>>();
    private Anagram currentAnagram;
    private int score;

    private Game() 
    {
        anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
        anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
        anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
    }

    
    /** 
     * This method is used as an accessor for the Game object
     * @return Game - returns singleton instance of game
     */
    public static Game getInstance()
    {
        if(game == null) {
            System.out.println("Creating a game.");
            game = new Game();
        }
        return game;
    }

    
    /** 
     * This method finds an angagram dependant on the players score and returns it
     * @return String - the anagram to be solved dependant upon player score
     */
    public String getQuestion()
    {
        if(getScore() < 4) 
        {
            level = Difficulty.EASY;
        }   
        else if(getScore() < 7)
        {
            level = Difficulty.MEDIUM;
        }
        else
            level = Difficulty.HARD;
        currentAnagram = anagrams.get(level).get(rand.nextInt(anagrams.get(level).size()));
        return currentAnagram.getQuestion();
    }

    
    /** 
     * This method uses the anagram class to check if userinput was correct
     * @param userAnswer - the user's guess
     * @return boolean - whether their guess was correct or not
     */
    public boolean isCorrect(String userAnswer)
    {
        if(currentAnagram.isCorrect(userAnswer))
        {
            score++;
            return true;
        }
        else {
            score--;
            return false;
        }
    }

    
    /**
     * This method is an accessor for the player's score 
     * @return int - player's score
     */
    public int getScore()
    {
        return this.score;
    }
}
