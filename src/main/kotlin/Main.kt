fun main() {
    val IvanovPerson = Person("Иванов", "Иван", 30)
    val PetrovEmployee = Employee(
        "288562465", "1013 456987", "789-654-321", "Петров", "Петр", 25
    )
    val SidorovDeveloper = Developer(
        "789258463", "1013 852741", "258963147", "Сидоров",
        "Сидор", 27, "Junior"
    )

    val arrayPerson: Array<Person> = arrayOf(IvanovPerson, PetrovEmployee, SidorovDeveloper)
    arrayPerson.forEach {
        it.fullName()
    }
}
