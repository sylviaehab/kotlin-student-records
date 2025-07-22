package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("this is for the commit")
    val names= listOf("sylvia","ali","ahmed","mona")
    val Scores = mutableMapOf(
        "sylvia" to 85,
        "ali" to 72,
        "ahmed" to 95,
        "mona" to 55

    )
    val grduatedStudents=setOf("mona","samy")

    println("Student Names: $names")
    println("Student Scores: $Scores")
    println("Graduated Students: $grduatedStudents")
    println()

    names.forEach { name ->
        if (name !in grduatedStudents) {
            println("Student: $name, Score: ${Scores[name]}")
        }
    }
    val uppercase=names.map{it.uppercase()}
    println("uppercase names is : $uppercase")
    val highScorers = Scores
        .filter { it.value > 80 }
        .map { it.key.uppercase() }
    println("High Scorers Above 80: $highScorers")
    println()

    val calc=Scores.values.reduce{ acc, next -> acc + next }
    println("total score is : $calc")

    val formatted = Scores.entries.fold("") { acc, entry ->
        if (acc.isEmpty()) "${entry.key}: ${entry.value}"
        else "$acc | ${entry.key}: ${entry.value}"
    }
    println("Formatted Scores-> $formatted")
    println()
    println("Report of student is:")
Report(Scores)

}
fun Report(scores: Map<String, Int>) {
    if (scores.isEmpty()) {
        println("No student data available.")
        return
    }
    scores.filter { it.value >= 60 }
        .map { "${it.key}: ${it.value}" }
        .forEach { println(it) }

}
