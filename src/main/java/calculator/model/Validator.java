package calculator.model;

public class Validator {
    public static void validate(int input){
        // 음수인 경우(type: int)
        if (input < 0){
            throw new IllegalArgumentException("입력값은 음수일 수 없습니다.");
        }
    }
}
