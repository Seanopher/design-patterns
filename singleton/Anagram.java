package singleton;

/**
 * @author seannary
 */

import java.util.ArrayList;

public class Anagram {
    private String question;
    private ArrayList<String> answers;

    public Anagram(String question, ArrayList<String> answers)
    {
        this.question = question;
        this.answers = answers;
    }
    
    
    /** 
     * This method returns the word that is used to look for anagrams
     * @return String - the question 
     */
    public String getQuestion()
    {
        return question;
    }
    
    /** 
     * This method takes in the userAnswer param to check if it is a valid anagram for the question
     * @param userAnswer - the user input that is checked againt a list of possible anagrams
     * @return boolean - returns whether the input is a valid anagram
     */
    public boolean isCorrect(String userAnswer)
    {
        for(int i=0; i<answers.size(); i++)
        {
            if(userAnswer.equals(answers.get(i)))
            {
                return true;
            }
        }
        return false;
    }
    
}
