open class Person(firstName: String, lastName: String, age: Int) {
    open val firstName = firstName
    open val lastName = lastName
    open val age = age

    open fun fullName() {
        println(firstName + " " + lastName)
    }

    open fun greeting(): String {
        return "Привет, я человек и меня зовут ${"$firstName $lastName"}"
    }
}
