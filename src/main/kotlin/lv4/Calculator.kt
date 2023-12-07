package lv4

import java.lang.IllegalArgumentException

abstract class Calculator {
    abstract fun operate(num1: Int, num2: Int): Double
}



class AddOperation: Calculator() {
    override fun operate(num1: Int, num2: Int): Double {
        return num1.toDouble() + num2.toDouble() }
}

class SubtractOperation: Calculator() {
    override fun operate(num1: Int, num2: Int): Double {
        return num1.toDouble() - num2.toDouble()
    }
}


class MultiplyOperation: Calculator() {
    override fun operate(num1: Int, num2: Int): Double {
        return num1.toDouble() * num2.toDouble()
    }
}

class DivideOperation: Calculator() {
    override fun operate(num1: Int, num2: Int): Double {
        return if (num2!=0) num1.toDouble() / num2.toDouble()
        else throw IllegalArgumentException("0으로 나눌 수 없습니다. ")
    }
}



fun main() {
    println("첫 번째 숫자를 입력하세요 :  ")
    var num1 = readln().toInt()  //정수값 입력받아서 초기화하기
    println("연산 기호를 입력하세요: ( +, -, *, / ) ")
    var operator = readln() //연산자 입력받아 초기화하기
    println("두 번째 숫자를 입력하세요: ")
    var num2 = readln().toInt() //정수값 입력받아서 초기화하기
    val calculator =
            when (operator) {
            "+" -> AddOperation()
            "-" -> SubtractOperation()
            "*" -> MultiplyOperation()
            "/" -> DivideOperation()
            else -> throw IllegalArgumentException("잘못된 연산자입니다.")}
    val result = calculator.operate(num1, num2)
    println("${num1} ${operator} ${num2}는 ${result} 입니다. ")

}