def head[A](xs: List[A]): A = xs(0)

head(1 :: 2 :: Nil)

case class Car(make: String)

head(Car("Civic") :: Car("CR-V") :: Nil)