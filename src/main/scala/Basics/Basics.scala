package Basics

object Basics extends App{

    // VARIABLES AND VALUES

    // VALS are immutable
    val value = 20
    val anotherValue: Int = 20
    val aString: String = "Hello Scala"
    val aBoolean: Boolean = true
    val aChar: Char = 'A'
    val aDouble: Double = 20.00

    // VARS are mutable
    var variable = 20
    variable += 10

    // EXPRESSIONS AND CODE BLOCKS

    // EXPRESSION
    val anEvenValue = if (10 % 2 == 0) "EVEN" else "ODD"

    // CODE BLOCK
    var initialValue = 10

    val aCodeBlockValue = {
        initialValue = if(initialValue % 2 == 0) initialValue + 2 else initialValue + 1
        initialValue += 20
        initialValue
    }

    // Functions
    def aGreetFunction(name: String, age: Int): Unit = {
        println(s"Hello! my name is $name, and I am $age years old")
    }
    aGreetFunction("Akshay", 26)

    def aFactorialFunction(number: Int): Int = {
        if (number ==  1) 1
        else number * aFactorialFunction(number - 1)

    }

    val aFactorialValue = aFactorialFunction(5)
    println(s"Factorial Value => $aFactorialValue")

    def aFibonacciNumber(number: Int): Int = {
        if (number <= 2) 1
        else aFibonacciNumber(number - 1) + aFibonacciNumber(number - 2)
    }

    // Called by Value
    def calledByValue(value: Long): Unit = {
        println("Called By Value => " + value)
        println("Called BY Value => " + value)
    }

    // Called By Name
    def calledByName(value: => Long): Unit = {
        println("Called By Name => " + value)
        println("Called By Name => " + value)
    }

    calledByValue(System.nanoTime())
    calledByName(System.nanoTime())

    // String Operations

    val introduction = "Hi, my name is Akshay and I am a Data Engineer"

    val firstCharacter = introduction.charAt(0)
    val lastCharacter = introduction.charAt(introduction.length - 1)
    println(firstCharacter)
    println(lastCharacter)

    println(introduction.substring(0, 3))

    val splitted = introduction.split(" ").toList
    splitted.foreach(println)

    val anotherIntroduction = introduction.replace("Data Engineer", "Data Scientist")
    println(anotherIntroduction)

    println(introduction.reverse)

}
