case class Pos(x: Int, y: Int) {
  /** The position obtained by changing the `x` coordinate by `d` */
  def dx(d: Int) = copy(x = x + d)

  /** The position obtained by changing the `y` coordinate by `d` */
  def dy(d: Int) = copy(y = y + d)
}
for(i <- Stream(1,2,3)) yield i