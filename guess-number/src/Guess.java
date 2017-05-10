
public class Guess {

    private final CompareNumber compareNumber;
    private final String answer;

    public Guess(CompareNumber compare, AnswerGenerator generator){
        answer = generator.generate();
        compareNumber = compare;
    }

    public String compare(String input){

        return compareNumber.compare(answer, input);
    }
}
