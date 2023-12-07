package lv3

class Calculator {
    fun calc(num1: Int, operator: String, num2: Int): Any {
        return when (operator) {
                "+" -> AddOperation().operate(num1, num2)
                "-" -> SubtractOperation().operate(num1, num2)
                "*" -> MultiplyOperation().operate(num1, num2)
                "/" -> DivideOperation().operate(num1, num2)
                else -> "잘못된 연산자입니다. "
            }
        }
    }


class AddOperation {
        fun operate(num1: Int, num2: Int): Double {
            return num1.toDouble() + num2.toDouble() }
}

class SubtractOperation {
    fun operate(num1: Int, num2: Int): Double {
        return num1.toDouble() - num2.toDouble()
    }
}


class MultiplyOperation {
    fun operate(num1: Int, num2: Int): Double {
        return num1.toDouble() * num2.toDouble()
    }
}

class DivideOperation {
    fun operate(num1: Int, num2: Int): Any {
        return if (num2 != 0) {num1.toDouble() / num2.toDouble()}
        else {"0으로 나눌 수 없습니다. "}
    }
}





fun main() {
        var calculator = Calculator()
        println("첫 번째 숫자를 입력하세요 :  ")
        var num1 = readln().toInt()
        println("연산 기호를 입력하세요: ( +, -, *, / ) ")
        var operator = readln()
        println("두 번째 숫자를 입력하세요: ")
        var num2 = readln().toInt()
        var result: Any = calculator.calc(num1, operator, num2)
        println("$num1 $operator ${num2}의 결과는 $result 입니다. ")
    }
