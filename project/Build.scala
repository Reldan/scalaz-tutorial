import sbt._

object DaggerFrogBuild extends Build {
  lazy val root     = Project("root", file(".")) aggregate scalazt
  lazy val scalazt   = Project("scalazt", file("scalazt"))
}