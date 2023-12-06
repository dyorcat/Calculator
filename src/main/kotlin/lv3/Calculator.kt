package lv3

class Calculator {
    init {
        println("저는 바보 계산기입니다. ")
    }

    fun calc() {
        println("첫 번째 숫자를 입력하세요 :  ")
        var num1 = readln().toInt()
        println("연산 기호를 입력하세요: ( +, -, *, / ) ")
        var operator = readln()
        println("두 번째 숫자를 입력하세요: ")
        var num2 = readln().toInt()
        when (operator) {
            "+" -> {
                AddOperation().operate(num1, num2)
            }

            "-" -> {
                SubstractOperation().operate(num1, num2)
            }

            "*" -> {
                MultiplyOperation().operate(num1, num2)
            }

            "/" -> {
                when (num2) {
                    0 -> {
                        println("0으로 나눌 수 없습니다.")
                    }

                    else -> {
                        DivideOperation().operate(num1, num2)
                    }
                }
            }

            else -> {
                println("사용할 수 없는 연산자 입니다. ")
            }
        }
    }
}

class AddOperation {
        fun operate(num1: Int, num2: Int) {
        println("$num1 더하기 $num2 (은)는 ${(num1.toDouble() + num2.toDouble())}입니다. ")
    }
}

class SubstractOperation {
    fun operate(num1: Int, num2: Int) {
        println("$num1 빼기 $num2 (은)는 ${(num1.toDouble() - num2.toDouble())}입니다. ")
    }
}


class MultiplyOperation {
    fun operate(num1: Int, num2: Int) {
        println("$num1 곱하기 $num2 (은)는 ${(num1.toDouble() * num2.toDouble())}입니다. ")
    }
}

class DivideOperation {
    fun operate(num1: Int, num2: Int) {
        println("$num1 나누기 $num2 (은)는 ${(num1.toDouble() / num2.toDouble())}입니다. ")
    }
}


fun main() {
    var calculator = Calculator()
    calculator.calc()

}



