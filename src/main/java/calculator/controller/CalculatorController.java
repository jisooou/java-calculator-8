package calculator.controller;

import calculator.model.Calculator;
import calculator.model.Validator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;
    private final Calculator calculator;

    public CalculatorController(InputView inputView, OutputView outputView, Calculator calculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.calculator = calculator;
    }

//    1. InputView에서 입력받은 문자열 전달 받는다.
//    2. Calculator를 호출한다. (Calculator 내에 SplitHandler, Validator)
//    3. OutputView로 최종 결과를 전달한다.
    public void runMain(){
        String input = inputView.readInput();
        int result = calculator.add(input);
        outputView.printResult(result);
    }
}
