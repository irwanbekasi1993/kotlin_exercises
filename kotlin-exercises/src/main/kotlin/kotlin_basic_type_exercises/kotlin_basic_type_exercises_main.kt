package kotlin_basic_type_exercises

import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>){
    var a: Int = 100000
    var b: Double = 100.00
    var c: Float = 100f
    var d: Long = 100000
    var e: Short = 10
    var f: Byte = 1

    println(a);
    println(b);
    println(c);
    println(d);
    println(e);
    println(f);

    var letter: Char= 'A'

    println(letter);

    var bool:Boolean=true
    println(bool);

    var str:String="hello string"
    println(str);

    var intArr:IntArray = intArrayOf(1,2,3,4,5,6,7,8,9)
    println(intArr[0]);

    var dataOfList:MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9)
    println(dataOfList);

    //MutableList<Int> can do delete

    var saveDataToList:List<Int> = dataOfList
    println(saveDataToList);

    var hashmapvarue = hashMapOf("a" to 1)
    println(hashmapvarue)

    var hashsetvarue = hashSetOf("a","a","b","b")
    println(hashsetvarue);

}