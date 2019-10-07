object Main extends App {
  def twice(f: Int => Int): Int => Int = f.compose(f)
}