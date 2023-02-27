
/*
FizzBuzz: Write a program that prints the numbers from 1 to 100, but for multiples of three, print "Fizz" instead of the number, and for multiples of five, print "Buzz". For numbers that are multiples of both three and five, print "FizzBuzz"
*/
class FizzBuzz {
    companion object {
        fun run() {

            for (i in 1..100){
                val isMultipleOfThree:Boolean = i % 3 == 0
                val isMultipleOfFive:Boolean = i % 5 == 0
                val isMultipleForFiveAndThree:Boolean = isMultipleOfThree && isMultipleOfFive

                if(isMultipleOfThree){
                    println("Fizz")
                }else if(isMultipleOfFive){
                    println("Buzz")
                }else if(isMultipleForFiveAndThree){
                    print("Fizz Buzz")
                }else{
                    println(i)
                }
            }
        }
    }

}