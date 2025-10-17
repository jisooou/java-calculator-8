package calculator.model;

public class Calculator {
    //SplitHandler에서 return한 값을 받아서 합한다.
    public int add(String input){
        String[] nums = SplitHandler.split(input);
        int sum = 0;
        for(String num : nums){
            int n = Integer.parseInt(num);
            Validator.validate(n);
            sum += n;
        }
        return sum; 
    }
}
