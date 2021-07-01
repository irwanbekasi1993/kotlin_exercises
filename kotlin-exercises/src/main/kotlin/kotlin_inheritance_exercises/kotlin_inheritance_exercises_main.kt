package kotlin_inheritance_exercises

interface Mathematics{
    fun doSpecialization(desc:String):String{
        return desc;
    }
}

interface Human{
    fun doProfession(desc:String):String{
        return desc;
    }
}

open class Creature{
    open fun classification(desc:String):String{
return "description: ${desc}"
    }

}

class Mammal:Creature(){
    override fun classification(desc: String): String {
        return super.classification(desc)
    }
}

class Reptile:Creature(){
    override fun classification(desc: String): String {
        return super.classification(desc)
    }
}

class Bird:Creature(){
    override fun classification(desc: String): String {
        return super.classification(desc)
    }
}

class Pet:Creature(){
    override fun classification(desc: String): String {
        return super.classification(desc)
    }
}

class Engineer:Human{
    override fun doProfession(desc: String): String {
        return super.doProfession(desc)
    }
}

class Labour:Human{
    override fun doProfession(desc: String): String {
        return super.doProfession(desc)
    }
}

class Economy:Mathematics{
    override fun doSpecialization(desc: String): String {
        return super.doSpecialization(desc)
    }
}

class Fiskal:Mathematics{
    override fun doSpecialization(desc: String): String {
        return super.doSpecialization(desc)
    }
}

class Accounting:Mathematics{
    override fun doSpecialization(desc: String): String {
        return super.doSpecialization(desc)
    }
}

class Physics:Mathematics{
    override fun doSpecialization(desc: String): String {
        return super.doSpecialization(desc)
    }
}

class Statistics:Mathematics{
    override fun doSpecialization(desc: String): String {
        return super.doSpecialization(desc)
    }
}

fun main() {
    var tiger=Mammal()
    println(tiger.classification("have four legs"))

    var snake=Reptile()
    println(snake.classification("no legs"))

    var chicken=Bird()
    println(chicken.classification("2 legs, many furs, having 2 wings"))

    var cat=Pet()
    println(cat.classification("mini size, 4 legs, part of mammal, many furs"))

    var engineer=Engineer()
    engineer.doProfession("do maintain machine")

    var labour=Labour()
    labour.doProfession("do hard working")

    var economy=Economy()
    economy.doSpecialization("math used for economy")

    var fiskal=Fiskal()
    fiskal.doSpecialization("math used for fiskal")

    var fisika=Physics()
    fisika.doSpecialization("math used for physics")

    var statistics=Statistics()
    statistics.doSpecialization("math used for statistics")


}