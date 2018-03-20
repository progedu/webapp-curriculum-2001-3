object Main {

  def twice(f: Int => Int): Int => Int = {
    (x: Int) => f(f(x))
  }

}
