package lv1

class Calculator {
    var num1: Int = 0
    var operator: String = "+"
    var num2: Int = 0

    fun operate(num1: Int, operator: String, num2: Int) {
        return when (operator) {
            "+" -> {
                println(num1 + num2)
            }
            "-" -> {
                println(num1 - num2)
            }
            "*" -> {
                println(num1 * num2)
            }
            "/" -> {
                println(num1 / num2)
            }
            else -> {
                println("잘못된 연산자 입니다.")
            }
        }
    }
}
fun main() {
    var calculator = Calculator()
    println("저는 바보계산기입니다. ")
    println("첫 번째 숫자를 입력하세요 :  ")
    var num1 = readln().toInt()
    calculator.num1 = num1
    println("연산 기호를 입력하세요: ( +, -, *, / ) ")
    var operator = readln()
    calculator.operator = operator
    println("두 번째 숫자를 입력하세요: ")
    var num2 = readln().toInt()
    calculator.num2 = num2
    calculator.operate(num1, operator, num2)


}
