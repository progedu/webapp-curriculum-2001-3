object Main {

  def twice(f: Int => Int): Int => Int = {
    f(f(n))
  }
}
