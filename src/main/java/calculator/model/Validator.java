package calculator.model;

public class Validator {

    // 입력값에 대한 validator도 이 파일 안에서 만든다.
    private final String inputString;

    public Validator(String inputString) {
        this.inputString = inputString;
    }

    public static void validate(int input){
        // 음수인 경우
        if (input < 0){
            throw new IllegalArgumentException("음수를 입력할 수 없습니다.");
        }

    }
}
