/**
    Find the Kth element of a list.
    By convention, the first element in the list is element 0.
    Example:

    scala> nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2
  */

def nth (position:Int, xs:List[Any]) : Int= {
  xs(position)
}


nth(2, List(4, 2, 1, 5, "blue"))