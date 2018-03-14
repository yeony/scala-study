/*
* 1부터 100까지 숫자를 출력하되,
* 각 줄에 다섯 숫자씩 묶어서 출력하라.
* 1, 2, 3, 4, 5,
* 6, 7, 8, 9, 10,
* ...
* */

for (i <- 1 to 100) i match {
  case _ if i == 100 => print(i)
  case _ if i % 5 == 0 => println(i + ", ")
  case _ => print(i + ", ")
}