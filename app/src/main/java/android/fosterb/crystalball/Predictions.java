package android.fosterb.crystalball;

/**
 * Created by Student on 9/8/2014.
 */
public class Predictions{
   private static Predictions predictions;
    private String[] answers;

    private Predictions() {
        answers = new String[] {
                "Your wishes will come true",
                "Your wishes will NEVER be true"
        };
    }

    public static Predictions get() {
        if(predictions == null) {
            predictions = new Predictions();
        }
        return predictions;
    }
    public String getPredictions() {
        return answers[1];
    }
}
