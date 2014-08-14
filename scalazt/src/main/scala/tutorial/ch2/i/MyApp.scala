package tutorial.ch2.i

import scalaz._
import Scalaz._

//data TrafficLight = Red | Yellow | Green

object MyApp extends App {
//  sealed trait TrafficLight
//  case object Red extends TrafficLight
//  case object Yellow extends TrafficLight
//  case object Green extends TrafficLight

//  implicit val TrafficLightEqual: Equal[TrafficLight] = Equal.equal(_ == _)

  //Red === Yellow

  case class TrafficLight(name: String)
  val red = TrafficLight("red")
  val yellow = TrafficLight("yellow")
  val green = TrafficLight("green")
  implicit val TrafficLightEqual: Equal[TrafficLight] = Equal.equal(_ == _)
  (red === yellow).println
  (red == yellow).println
  (red === red).println
  (yellow === yellow).println
}
