object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("hello world !")

        val newUser = new User("yuto", 21)
        User.printUser(newUser)

        val newAge = new Age(22)
        Age.printIsSchool(newAge.age)

        var i = 0
        while (i <= 10) {
            println(i)
            i += 1
        }
    }
}

case class User(name: String, age: Int)
object User {
    def printUser(user: User): Unit = {
        println(s"Name: ${user.name}, Age: ${user.age}")
    }
}

case class Age(age: Int)
object Age {
    def printIsSchool(age: Int): Unit = {
        val isSchool = age >= 6 && age <= 18
        println(s"Is school age: $isSchool")
    }
}
