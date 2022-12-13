class Employee(inn: String, number: String, snils: String, firstName: String, lastName: String, age: Int) :
    Person(firstName, lastName, age) {
    val inn = inn
    val number = number
    val snils = snils
}
