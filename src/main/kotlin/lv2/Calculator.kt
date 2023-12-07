package lv2
class Calculator {
    fun operate(num1: Int, operator: String, num2: Int): Any {
        return when (operator) {
            "+" -> (num1 + num2)
            "-" -> (num1 - num2)
            "*" -> (num1 * num2)
            "/" -> (num1.toDouble() / num2.toDouble())
            "%" -> (num1 % num2)
            else -> "잘못된 연산자 입니다."
        }
    }
}

fun main() {
    var calculator = Calculator()
    println("저는 바보계산기입니다. ")
    println("첫 번째 숫자를 입력하세요 :  ")
    var num1 = readln().toInt()
    println("연산 기호를 입력하세요: ( +, -, *, / ) ")
    var operator = readln()
    println("두 번째 숫자를 입력하세요: ")
    var num2 = readln().toInt()
    var result = calculator.operate(num1, operator, num2)
    println(result)
}
