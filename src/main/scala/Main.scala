object Main {

  def twice(f: Int => Int): Int => Int =  (n) =>{
    f(f(n))
  }
}
