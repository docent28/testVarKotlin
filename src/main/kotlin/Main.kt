fun main() {
    val Ivanov = Person("Иванов", "Иван", 30)
    val Petrov = Employee(
        "288562465", "1013 456987", "789-654-321",
        "Петров", "Петр", 25
    )
    println(Ivanov.firstName)
    println(Petrov.firstName)
    println(Petrov.snils)
    val arrayPerson: Array<Person> = arrayOf(Ivanov, Petrov)
    arrayPerson.forEach {
        println(it.lastName)
    }
}
