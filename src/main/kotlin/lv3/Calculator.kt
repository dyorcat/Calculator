package lv3

class Calculator {
    var num1: Int = 0
    var operator: String = " "
    var num2: Int = 0
    var result: Any = ""
    fun calc() {
        when(operator) {
            "+" -> {
                result = "${num1} 더하기 ${num2}는 ${AddOperation().operate(num1, num2)}입니다. "
            }

            "-" -> {
                result = "${num1} 빼기 ${num2}는 ${SubstractOperation().operate(num1, num2)}입니다. "
            }

            "*" -> {
                result = "${num1} 곱하기 ${num2}는 ${MultiplyOperation().operate(num1, num2)}입니다. "
            }
            "/" -> {
                when (num2) {
                    0 -> {
                        result = "0으로 나눌 수 없습니다."
                    }

                    else -> {
                        result = "${num1} 나누기 ${num2}는 ${DivideOperation().operate(num1, num2)} 입니다. "
                    }
                }
            }
        else -> { result = "사용할 수 없는 연산자 입니다. "}
        }
    }
}

class AddOperation {
        fun operate(num1: Int, num2: Int): Double {
        return (num1 + num2).toDouble()
    }
}

class SubstractOperation {
    fun operate(num1: Int, num2: Int): Double {
        return (num1 - num2).toDouble()
    }
}


class MultiplyOperation {
    fun operate(num1: Int, num2: Int): Double {
        return (num1 * num2).toDouble()
    }
}

class DivideOperation {
    fun operate(num1: Int, num2: Int): Double {
        return (num1 / num2).toDouble()
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
    calculator.calc()
    println(calculator.result)

}



