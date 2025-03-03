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
  }
}

abstract class Shape {
  def area: Double
}

class Rectangle(val h: Double, val w: Double) extends Shape {
  def area: Double = w * h
}

class Circle(val r: Double) extends Shape {
  def area: Double = r * r * math.Pi
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
