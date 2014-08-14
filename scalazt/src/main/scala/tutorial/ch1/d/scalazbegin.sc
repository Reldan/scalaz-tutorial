import scalaz._
import Scalaz._

1.some | 2
Some(1).getOrElse(2)

(1 > 10)? 1 | 2
if (1 > 10) 1 else 2