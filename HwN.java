package homewrk;

public class HwN {
	public class WordMatch
	{
	    /** The secret string. */
	    private String secret;

	    /** Constructs a WordMatch object with the given secret string. */
	    public WordMatch(String word)
	    {
	        secret = word;
	    }

	    /**
	     * Returns a score for guess.
	     * The score is:
	     * number of occurrences of guess × (length of guess)²
	     */
	    public int scoreGuess(String guess)
	    {
	        int count = 0;

	        // Check every possible starting position
	        // so that overlapping occurrences are counted.
	        for (int i = 0; i <= secret.length() - guess.length(); i++)
	        {
	            if (secret.substring(i, i + guess.length()).equals(guess))
	            {
	                count++;
	            }
	        }

	        return count * guess.length() * guess.length();
	    }

	    /**
	     * Returns the better of two guesses.
	     * If scores are equal, returns the alphabetically greater guess.
	     */
	    public String findBetterGuess(String guess1, String guess2)
	    {
	        int score1 = scoreGuess(guess1);
	        int score2 = scoreGuess(guess2);

	        if (score1 > score2)
	        {
	            return guess1;
	        }
	        else if (score2 > score1)
	        {
	            return guess2;
	        }
	        else
	        {
	            // Scores are equal, so choose alphabetically greater.
	            if (guess1.compareTo(guess2) > 0)
	            {
	                return guess1;
	            }
	            else
	            {
	                return guess2;
	            }
	        }
	    }
	}

}
