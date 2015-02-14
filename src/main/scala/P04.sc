/**
    Find the number of elements of a list.
    Example:
    scala> length(List(1, 1, 2, 3, 5, 8))
    res0: Int = 6
  */

def length(xs:List[Any]) : Int = {
  xs.size
}


length(List(1, 4, 2, 1, 6))