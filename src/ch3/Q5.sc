/*
* 1부터 100까지의 숫자를 출력하되,
* 3의배수일 경우네는 "type"을 출력하고
* 5의배수인 경우네는 "safe"
* 3과 5 모두의 배수인 경우에는 "typesafe"를 출력하는 표현식을 작성하라.
* */


for (i <- 1 to 100) i match {
  case _ if i % 15 == 0 => print("typesafe, ")
  case _ if i % 3 == 0 => print("type, ")
  case _ if i % 5 == 0 => print("safe, ")
  case _ => print(i + ", ")
}