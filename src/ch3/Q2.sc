/*
* double 타입의 amount가 주어졌을때 그 값이
* 0보다크면 "greater"를,
* 0과 같은경우 "same"을,
* 0보다 작은경우 "less"를 반환하는 표현식을 작성하라.
* 이것을 if,else블록으로 작성할 수 있는가?
* 매치표현식으로 작성할수 있는가?
* */

val amount: Double = -1

val result = amount match {
  case _ if amount > 0 => "greater"
  case _ if amount == 0 => "same"
  case _ => "less"
}