/*
* 문자열 name이 주어졌을때 빈 문자열이 아니면 동일한 문자열을 반환하고,
* 그렇지 않은 경우(빈 문자열인 경우) "n/a" 문자열을 반환하는
* 매치 표현식을 작성해보자.
* */
val name = ""

val result = name match {
  case n if n != "" => n
  case _ => "n/a"
}