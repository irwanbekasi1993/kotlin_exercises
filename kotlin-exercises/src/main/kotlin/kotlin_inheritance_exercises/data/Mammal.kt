package kotlin_inheritance_exercises.data

import kotlin_inheritance_exercises.Creature

class Mammal: Creature(){
    override fun classification(desc: String): String {
        return super.classification(desc)
    }
}