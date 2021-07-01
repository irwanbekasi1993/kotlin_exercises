package kotlin_inheritance_exercises.data

import kotlin_inheritance_exercises.Creature

class Reptile: Creature(){
    override fun classification(desc: String): String {
        return super.classification(desc)
    }
}