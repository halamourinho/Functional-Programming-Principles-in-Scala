def balance(chars: List[Char]): Boolean = {
  def helper(count: Int, chars: List[Char]): Boolean = {
    if (count < 0)
      false
    else if (chars.isEmpty)
      count == 0
    else {
      val c = chars.head
      if (c == '(')
        helper(count + 1, chars.tail)
      else if (c == ')')
        helper(count - 1, chars.tail)
      else
        helper(count, chars.tail)
    }
  }
  helper(0, chars)
}
balance("(((hello)there)you)(".toList)
