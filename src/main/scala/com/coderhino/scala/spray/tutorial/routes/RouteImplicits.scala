package com.coderhino.scala.spray.tutorial.routes

import akka.util.Timeout
import scala.concurrent.duration._

object RouteImplicits {
  implicit val timeout = Timeout(2.seconds)
}
