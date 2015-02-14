import scala.collection.mutable.ListBuffer

/**
    Flatten a nested list structure.
    Example:
    scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  */

def flatten(xs:List[List[Int]]) = {
  xs.flatten
}





flatten(List(List(1, 2), List(3, 4)))