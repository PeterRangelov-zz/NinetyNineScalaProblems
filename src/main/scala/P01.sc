/**
    Find the last element of a list.
    Example:
    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8
 */


def p01 (xs:List[Any]) : Any = {
  xs(xs.size-1)
}

p01(List(1, 2, 5, 6, "TWO", 9, "Green"))