class Developer(
    inn: String,
    number: String,
    snils: String,
    firstName: String,
    lastName: String,
    age: Int,
    level: String
) : Employee(inn, number, snils, firstName, lastName, age) {
    private val level = level

    override fun greeting(): String {
        return "Привет, я прогер и меня зовут ${"$firstName $lastName"}"
    }
}
