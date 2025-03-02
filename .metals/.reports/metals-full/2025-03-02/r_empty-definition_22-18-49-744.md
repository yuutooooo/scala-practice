error id: `<error>`#`<error>`.
file://<WORKSPACE>/Hello.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -newUser/printUser.
	 -newUser/printUser#
	 -newUser/printUser().
	 -scala/Predef.newUser.printUser.
	 -scala/Predef.newUser.printUser#
	 -scala/Predef.newUser.printUser().

Document text:

```scala
// object HelloWorld {
//   def main(args: Array[String]): Unit = {
//     println("Hello, World!")
//   }
// }
object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("hello world !")
        val newUser = new  User("yuto", 21)
        newUser.printUser()
    }
}
```

#### Short summary: 

empty definition using pc, found symbol in pc: 