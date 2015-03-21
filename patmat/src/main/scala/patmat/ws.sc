List(1,2)++List(2,3,4)
val x = 1/2
List(1,2,3,4,5).splitAt(2)
List((5,2),(3,4)).sorted
val v = (1)
for(x <- List((1, List(1,2,2)), (2, List(2,3)), (3, List(3,4))); y <- x._2; if y ==2) yield x._1
