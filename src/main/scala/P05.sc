import scala.collection.mutable.ListBuffer

/**
    Reverse a list.
    Example:
    scala> reverse(List(1, 1, 2, 3, 5, 8))
    res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */

def reverse (xs:List[Int]) = {
  var reversedList = new ListBuffer[Int]

  for (i <-0 until xs.size) {
    reversedList+=xs(xs.size-i-1)
  }

  reversedList.toList
}

reverse(List(1, 2, 3, 4, 5))