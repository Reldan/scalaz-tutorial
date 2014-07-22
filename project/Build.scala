import sbt._

object DaggerFrogBuild extends Build {
  lazy val root     = Project("root", file(".")) aggregate(scalaz)
  lazy val scalaz   = Project("scalaz", file("scalaz"))
}