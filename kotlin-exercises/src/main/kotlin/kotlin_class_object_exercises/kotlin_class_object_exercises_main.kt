package kotlin_class_object_exercises

class varObject{
    var sides:Int=0;
    var angles:Int=0;
    var desc:String="";

    constructor(sides:Int, angles:Int, desc:String){
        this.sides=sides;
        this.angles=angles;
        this.desc=desc;
    }
    fun doPrint():String{
        return "value of sides: ${sides}, value of angles: ${angles}, value of desc: ${desc} "
    }

}

class Transportation{
    var mode:String=""
    var type:String=""
    var vehicle:String=""

    constructor(mode:String,type:String,vehicle:String){
        this.mode=mode;
        this.type=type;
        this.vehicle=vehicle;
    }

    fun doPrint():String{
        return "value of mode: ${mode}, value of type: ${type}, value of desc: ${vehicle} "
    }
}

fun main() {
var obj = varObject(0,0,"circles");
    println(obj.doPrint())
var transport = Transportation("udara","transportasi umum","pesawat komersil");
    println(transport.doPrint())
}