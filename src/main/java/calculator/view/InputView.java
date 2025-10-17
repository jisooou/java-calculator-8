package calculator.view;

import calculator.model.Validator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INPUT_PROMPT = "덧셈할 문자열을 입력해 주세요.";

    public Validator validateInput(){
        System.out.println(INPUT_PROMPT);
        String inputString = Console.readLine();
        return new Validator(inputString);
    }
}
