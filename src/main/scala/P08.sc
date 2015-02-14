import scala.collection.mutable.ListBuffer
/**
    Eliminate consecutive duplicates of list elements.
    If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
    Example:
    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */
def compress (xs:List[Symbol]) : List[Symbol] = {
  var result = new ListBuffer[Symbol]
  var toRemove = new ListBuffer[Symbol]

  result.appendAll(xs)


  for (i <- 1 until result.size) {
    if (result(i-1).equals(result(i))) {
      toRemove+=result(i)
    }
  }

  result.--(toRemove).toList
}

compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))