open class Employee(
    inn: String,
    number: String,
    snils: String,
    firstName: String,
    lastName: String,
    age: Int,
) : Person(firstName, lastName, age) {
    open val inn = inn
    open val number = number
    open val snils = snils

    open override fun greeting(): String {
        return "Привет, я работник и меня зовут ${"$firstName $lastName"}"
    }
}
