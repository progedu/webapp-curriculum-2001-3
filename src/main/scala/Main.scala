object Main {

  def twice(f: Int => Int): Int => Int = (x) => f(f(x))

}
