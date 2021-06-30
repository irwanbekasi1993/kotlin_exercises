package kotlin_flow_control_exercises

fun main(args:Array<String>){
    //for
    var intMax:Int = 100;
    for (i in 1..intMax)
        if(i%2==0)
     println(i);

    var intMultiValue = listOf(1,2,3,4,5,6,7,8,9)
    for (i in intMultiValue)
        if(i%2==0)
            println(i)

    for ((index,value) in intMultiValue.withIndex())
        println("index: $index , value: $value ")

    //if
    if(1<100)
        println("lower than")
    else
        println("bigger than")

    //when
    when(10){
        1->print("using when")
        else->{
            print("escape when")
        }
    }

    //while
    var x:Int = 0;
    while(x<=10){
        println(x)
        x++
    }

    println(doubleIt(10))
}

fun doubleIt(x:Int):Int{
    return x*x;
}