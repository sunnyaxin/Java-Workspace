import java.util.Random;

public class AnswerGenerator {

    Random mRandom;

    public AnswerGenerator(Random random){
        mRandom = random;
    }

    public String generate(){

        String result = "";

        while(result.length() < 4){
            String digit = mRandom.nextInt(10) + "";
            if(!result.contains(digit)){
                result += digit;
            }
        }

        return result;
    }
}
