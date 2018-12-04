object Main {

  //def twice(f: Int => Int): Int => Int = new Function1[Int, Int] {
  //  def apply(x: Int): Int = f(f(x))
  //}

  //def twice(f: Int => Int): Int => Int = {
  //  n: Int => f(f(n))
  //}  

  def twice(f: Int => Int): Int => Int = (x: Int) => f(f(x))

  //val twice = (f: Int => Int) => (n: Int) => f(f(n))

}
