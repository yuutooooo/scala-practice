error id: 
file://<WORKSPACE>/Hello.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -Age#
	 -scala/Predef.Age#

Document text:

```scala
object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("hello world !")
        val newUser = new User("yuto", 21)
        User.printUser(newUser)
        val newAge = new Age(22)
        Age.printIsSchool(newAge.age)
    }
}
```

#### Short summary: 

empty definition using pc, found symbol in pc: 