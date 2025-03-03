import javax.xml.transform.Source
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

    for (i <- 1 to 5; j <- 1 to 5) {
      println(s"i: $i, j: $j, i * j: ${i * j}")
    }

    for (e <- List(1, 2, 3, 4, 5)) { println(e) }

    // for (i <- 1 to 1000; j <- 1 to 1000; k <- 1 to 1000; if i * i + j * j == k * k) {
    //     println(s"i: $i, j: $j, k: $k")
    // }

    // for (i <- 1 to 100) {
    //     val s = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList match {
    //         case List(a,b,c,d,_) => List(a,b,c,d,a).mkString
    //     }
    //     println(s)
    // }

    val p1 = new Point(1, 1)
    val p2 = new Point(2, 4)
    val p3 = p1 + p2
    println(p3.toString())

    val p = new Point3D(10, 20, 30)
    println(p.x)
    println(p.y)
    println(p.z)

    var shape: Shape = new Rectangle(10.0, 20.0)
    println(shape.area)
    shape = new Circle(2.0)
    println(shape.area)

    val person1 = new PrivatePerson("yuto", 21, 70.0)
    println(PrivatePerson.getAge(person1))
    PrivatePerson.printWeight(person1)

    val cell = new Cell[Int](1)
    cell.put(2)
    println(cell.get())
    cell.put(5)
    cell.put(6)
    println(cell.get())
    println(cell.get())
    println(cell.toString())

    // def withFile(filename: String)(f: Source => A): A = {
    //   val source = Source.fromFile(filename)
    //   try {
    //     f(source)
    //   } finally {
    //     source.close()
    //   }
    // }

    // def printFile(filename: String): Unit = {
    //   withFile(filename) { source =>
    //     for (line <- source.getLines()) {
    //       println(line)
    //     }
    //   }
    // }

    def swapArray[T] (arr: Array[T])(i: Int, j: Int): Unit = {
        val tmp = arr(i)
        arr(i) = arr(j)
        arr(j) = tmp
    }

    val arr = Array(1, 2, 3, 4, 5)
    swapArray(arr)(0, 1)
    println(arr.mkString(", "))

    def joinByComma(start: Int, end: Int): String = {
        (start to end).mkString(",")
    }
    val joinedString = joinByComma(1, 10)
    println(joinedString)

    def reverse[T] (list: List[T]): List[T] = list.foldLeft(Nil: List[T])((a, c) => c :: a)
    val reversedList = reverse(List(1, 2, 3, 4, 5))
    println(reversedList)

    def mkstring[T] (list: List[T]): String = {list.foldLeft("")((a, b) => a + b)}
    val joinedList = mkstring(List(1, 2, 3, 4, 5))
    println(joinedList)
  }
}

trait Stack[+A] {
  def push[E >: A](e: E): Stack[E]
  def top: A
  def pop: Stack[A]
  def isEmpty: Boolean
}

class NonEmptyStack[+A](private val first: A, private val rest: Stack[A])
    extends Stack[A] {
  def push[E >: A](e: E): Stack[E] = new NonEmptyStack[E](e, this)
  def top: A = first
  def pop: Stack[A] = rest
  def isEmpty: Boolean = false
}

case object EmptyStack extends Stack[Nothing] {
  def push[E >: Nothing](e: E): Stack[E] = new NonEmptyStack[E](e, this)
  def top: Nothing = throw new IllegalArgumentException("empty stack")
  def pop: Nothing = throw new IllegalArgumentException("empty stack")
  def isEmpty: Boolean = true
}

object Stack {
  def apply(): Stack[Nothing] = EmptyStack
}

class Cell[A](var value: A) {
  def put(newValue: A): Unit = {
    value = newValue
  }
  def get(): A = value
  override def toString: String = s"Cell($value)"
}

class PrivatePerson(
    val name: String,
    private val age: Int,
    private val weight: Double
)

object PrivatePerson {
  def getAge(p: PrivatePerson): Int = p.age
  def printWeight(p: PrivatePerson): Unit = println(p.weight)
}
abstract class Shape {
  def area: Double
}

class Rectangle(val h: Double, val w: Double) extends Shape {
  override def area: Double = w * h
}

class Circle(val r: Double) extends Shape {
  override def area: Double = r * r * math.Pi
}

class Point3D(val x: Int, val y: Int, val z: Int)

class Point(val x: Int, val y: Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }
  override def toString: String = "(" + x + "," + y + ")"
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
