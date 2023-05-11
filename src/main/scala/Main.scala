object Main {

  def twice(act: Int => Int): Int => Int = x => act(act(x))

}
