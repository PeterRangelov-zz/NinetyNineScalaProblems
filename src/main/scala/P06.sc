/**
    Find out whether a list is a palindrome.
    Example:
    scala> isPalindrome(List(1, 2, 3, 2, 1))
    res0: Boolean = true
  */

def isPalindrome(xs:List[Int]) : Boolean = {
  for (i <-0 until xs.size) {
    if (xs(i) != xs(xs.size-i-1)) {
      return false
    }
  }
  true
}


isPalindrome(List(1, 2, 3, 2, 1))