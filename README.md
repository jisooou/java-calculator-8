# java-calculator-precourse

# 1주차 문자열 덧셈 계산기

---

### 어떻게 설계하면 좋을까?
* 이야기 
  * 문자열을 주면 숫자를 추출하여 계산기를 만든다.
* 협력: 요청과 응답 
  * 요청: 문자열을 준다.
  * 응답: 숫자를 추출해서 -> 합을 구한다.
* 책임: 하는 것과 아는 것 
  * 하는 것: 
    1. 쉼표(,), 콜론(:)을 구분자로 가지는 문자열을 받는다.
    2. 커스텀 구분를 가진 문자열을 받는다.
       (커스텀 구분자: //와 \n 사이에 위치하는 문자)
    => 구분자를 기준으로 분리한 각 숫자의 합을 구한다. 
  * 아는 것: 
    * 구분자를 가진 문자열 
* 역할: 책임의 집합(재사용성)
  * 구분자(SplitHandler)
  * 계산기(Calculator)
  * 검증(Validator)
---

<img width="641" height="391" alt="image" src="https://github.com/user-attachments/assets/2af730d7-a276-4313-8e6c-e36ed5f5044d" />

---
## 🔖 Model
### 1. SplitHandler
* 구분자를 구분하는 연산을 수행한다.
  * 쉼표(,), 콜론(:)
  * 커스텀 구분자 

### 2. Calculator
* `SplitHandler`에서 전달받은 숫자를 합한다.
  * 결과값은 `CalculatorController`에 반환한다.
* 잘못된 값을 입력한 경우 예외처리해야 한다.(문자열을 숫자로 변환하기 전)
  * 입력값이 비어있는 경우 `IllegalArgumentException`
  * 입력값에 숫자가 아닌 문자가 있는 경우 `IllegalArgumentException`

### 3. Validator
* 잘못된 값을 입력한 경우 예외처리해야 한다.(숫자로 변환 완료한 후)
  * 추출한 입력값에 음수가 있는 경우 `IllegalArgumentException`
---
## 🖥️ View
### InputView
* 입력을 받는다.
  * `덧셈할 문자열을 입력해 주세요.`

### OutputView
* 출력을 한다. 
  * `결과 : `
---
## ⚙️ Contrller
### CalculatorController
* `InputView`를 호출한다. 
* 입력받은 문자열을 `Calculator`로 전달한다. 
  * `Calculator`에서 `SplitHandler`를 통해 문자열에서 숫자를 추출한다. 
  * 추출한 숫자를 `Validator`를 거쳐 `Calculator`에서 연산을 수행한다.
* `OutputView`를 호출한다. 
