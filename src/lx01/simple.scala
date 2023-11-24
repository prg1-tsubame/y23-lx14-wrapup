package prg1.lx01

def simple(a: Int, n: Int): Int = {
  def aux(a: Int, i: Int): Int = {
    if (i > n) a else aux(a + i, i + 1)
  }
  aux(a, 1);
}

@main def run() = {
  println("1 + 2 + ... + 10 = " + simple(0, 10))
}