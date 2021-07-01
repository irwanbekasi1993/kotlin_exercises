package kotlin_inheritance_exercises.data

open class Creature {
    open fun classification(desc:String):String {
        return "description: ${desc}"
    }
}