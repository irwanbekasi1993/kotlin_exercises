package kotlin_flow_control_exercises

class BasicFlowControls {
    //for

    fun defineLoop(intMax:Int){
        for (i in 1..intMax)
            if(i%2==0)
                println(i);

    }

fun defineMultiValue(list:List<Int>){
    var intMultiValue = list
    for (i in intMultiValue)
        if(i%2==0)
            println(i)
    for ((index,value) in intMultiValue.withIndex())
        println("index: $index , value: $value ")

}

fun defineIfElse(intMax:Int){
    //if
    if(1<=intMax)
        println("lower than")
    else
        println("bigger than")

}

fun defineWhen(intPoint:Int){
    //when
    when(intPoint){
        1->print("using when")
        else->{
            print("escape when")
        }
    }
}

fun defineWhile(intMax: Int){
    //while
    var x:Int=1;
    while(x<=intMax){
        println(x)
        x++
    }
}


}