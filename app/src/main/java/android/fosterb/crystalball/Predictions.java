package android.fosterb.crystalball;

import java.util.Random;

/**
 * Created by Student on 9/8/2014.
 */
public class Predictions{
   private static Predictions predictions;
    private String[] answers;

    private Predictions() {
        answers = new String[] {
                "YES",
                "NO",
                "MAYBE",
                "Your wishes will come true",
                "Your wishes will NEVER be true",
                "The world may never know",
                "Your mom knows"
                //*text for the different answers in the app
        };
    }

    public static Predictions get() {
        if(predictions == null) {
            predictions = new Predictions();
        }
        return predictions;
    }
    public String getPredictions() {

        Random prediction = new Random();
        return answers[prediction.nextInt(7)];
        //*randomizes the answers
    }
}
