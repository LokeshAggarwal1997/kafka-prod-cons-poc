var a = List(1,2,3,4,5,List(7,8,9))
var t = List.range(1,5)
var b = List(List(1,2,3,4,5),List(8,9))
b.flatten

val c = 10

val x = List("aaaa","bbb")
  List(1,2,3,4) flatMap(i => List.range(1, i) map (j => (i, j)) )

