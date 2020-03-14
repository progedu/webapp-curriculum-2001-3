object Main {

  def twice(f: Int => Int): Int => Int = {
    new Function1[Int, Int] {
      def apply(x: Int): Int = f(x)
    }.andThen[Int](f)
  }

}
