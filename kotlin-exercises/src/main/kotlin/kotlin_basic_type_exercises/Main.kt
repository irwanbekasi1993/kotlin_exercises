package kotlin_basic_type_exercises

fun main() {
    var basic=BasicOperations()
    println(basic.defineInt(1))
    println(basic.defineChar('a'))
    println(basic.defineDouble(0.0))
    println(basic.defineFloat(0f))
    println(basic.defineString("hai"))
    basic.defineIntArr(intArrayOf(1,2,3,4,5,6,7,8,9))
    var mutableData:List<Int> = mutableListOf(1,2,3,4,5,6,7,8,9)
    basic.defineMuteableList(mutableListOf(1,2,3,4,5,6,7,8,9))
    basic.defineList(mutableData)
}

