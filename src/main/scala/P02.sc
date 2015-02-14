/**
    Find the last but one element of a list.
    Example:
    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5
  */

def penultimate (xs:List[Any]) : Any = {
  xs(xs.size-2)
}

penultimate(List(4, 221, 54, "one"))