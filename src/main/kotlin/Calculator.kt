class Calculator {
    var num1: Int = 0
    var sym: String = "+"
    var num2: Int = 0

    fun calc() {
        when (this.sym) {
            "+" -> {
                println("${num1} 더하기 ${num2}는 ${AddOperation().add(num1, num2)} 입니다. ")
            }

            "-" -> {
                println("${num1} 빼기 ${num2}는 ${SubstractOperation().minus(num1, num2)} 입니다. ")
            }

            "*" -> {
                println("${num1} 곱하기 ${num2}는 ${MultiplyOperation().multiple(num1, num2)} 입니다. ")
            }

            "/" -> {
                when (this.num2) {
                    0 -> {println(" 0으로 나눌 수 없습니다. ")
                    }
                    else -> println("${num1} 나누기 ${num2}는 ${DivideOperation().divide(num1, num2)} 입니다. ")
                }

            }
            else -> {
                println("사용할 수 없는 연산자 입니다")
            }
        }
    }


}
class AddOperation {
    fun add(num1: Int, num2: Int): Double {
        return (num1 + num2).toDouble()
    }
}

class SubstractOperation {
    fun minus(num1: Int, num2: Int): Double {
        return (num1 - num2).toDouble()
    }
}


class MultiplyOperation {
    fun multiple(num1: Int, num2: Int): Double {
        return (num1 * num2).toDouble()
    }
}
class DivideOperation {
    fun divide(num1: Int, num2: Int): Double {
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
    var sym = readln()
    calculator.sym = sym
    println("두 번째 숫자를 입력하세요: ")
    var num2 = readln().toInt()
    calculator.num2 = num2
    calculator.calc()
}


