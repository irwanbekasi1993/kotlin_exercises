package kotlin_inheritance_exercises

import kotlin_inheritance_exercises.data.*


fun main() {
    var tiger= Mammal()
    println(tiger.classification("have four legs"))

    var snake= Reptile()
    println(snake.classification("no legs"))

    var chicken= Bird()
    println(chicken.classification("2 legs, many furs, having 2 wings"))

    var cat= Pet()
    println(cat.classification("mini size, 4 legs, part of mammal, many furs"))

    var engineer= Engineer()
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

    var accounting=Accounting()
    accounting.doSpecialization("math used for accountings")
}