public class MethodsChallenge {

    // Challenge
    //
    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an int
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50
    //
    public void main() {
        System.out.println("\n \n");
        System.out.println("Java Programming Masterclass #4 - Methods and a Challenge");
        System.out.println("------------------------------------------------- \n");

        int playerOneScore = calculateScore(true, 950, 1, 100);
        int playerOneScorePosition = calculateHighScorePosition(playerOneScore);
        displayHighScorePosition("PlayerOne", playerOneScorePosition);

        int playerTwoScore = calculateScore(true, 450, 4, 100);
        int playerTwoScorePosition = calculateHighScorePosition(playerTwoScore);
        displayHighScorePosition("PlayerTwo", playerTwoScorePosition);

        int playerThreeScore = calculateScore(true, 50, 3, 100);
        int playerThreeScorePosition = calculateHighScorePosition(playerThreeScore);
        displayHighScorePosition("PlayerThree", playerThreeScorePosition);

        int playerFourScore = calculateScore(true, 0, 0, 0);
        int playerFourScorePosition = calculateHighScorePosition(playerFourScore);
        displayHighScorePosition("PlayerFour", playerFourScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table. \n");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        }
        if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 50;
            return finalScore;
        }
        return -1;
    }

}
