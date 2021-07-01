package kotlin_class_object_exercises.data

class Transportation(

    mode:String="",
    type:String="",
    vehicle:String=""

) {
    init{
        println("desc of mode: ${mode}, type: ${type}, and vehicle: ${vehicle}")
    }
}
