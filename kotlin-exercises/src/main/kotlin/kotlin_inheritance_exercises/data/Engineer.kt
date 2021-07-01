package kotlin_inheritance_exercises.data

import kotlin_inheritance_exercises.Human

class Engineer: Human {
    override fun doProfession(desc: String): String {
        return super.doProfession(desc)
    }
}