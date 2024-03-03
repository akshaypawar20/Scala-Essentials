package Basics

object Basics extends App{
    def rangeAddition(lowerBound: Int, upperBound: Int): Int = {
        var sum = 0
        for (element <- lowerBound to upperBound + 2) {
            sum += element
        }
        return sum
    }

    print(rangeAddition(0, 5))
}
