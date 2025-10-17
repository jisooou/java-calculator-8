package calculator.model;

public class Validator {
    public static void validate(int input){
        // 음수인 경우
        if (input < 0){
            throw new IllegalArgumentException("음수를 입력할 수 없습니다.");
        }

    }
}
