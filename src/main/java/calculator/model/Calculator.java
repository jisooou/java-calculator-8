package calculator.model;

public class Calculator {
    //SplitHandler에서 return한 값을 받아서 합한다.
    public int add(String input){
        //input 문자열이 null이거나 비어있는 경우(type: string)
        if(input == null || input.isEmpty()){
            throw new IllegalArgumentException("입력값이 비어있습니다.");
        }

        String[] nums = SplitHandler.split(input);
        int sum = 0;
        for(String num : nums){
            int n;
            try{
                n = Integer.parseInt(num);
            } catch (NumberFormatException e) {
                //num에 숫자가 아닌 문자가 포함되어 있는 경우
                throw new IllegalArgumentException("입력값에 숫자가 아닌 문자가 포함되어 있습니다.");
            }
            Validator.validate(n);
            sum += n;
        }
        return sum;
    }
}
