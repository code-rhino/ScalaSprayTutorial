package com.coderhino.scala.spray.tutorial.core

import akka.actor.Props
import com.coderhino.scala.spray.core.{Core, CoreActors}
import com.coderhino.scala.spray.tutorial.routes.GreeterRoute
import com.coderhino.scala.spray.util.Services.RoutedHttpService
import spray.routing.RouteConcatenation

trait Api extends RouteConcatenation {
  this: CoreActors with Core =>
    private implicit val _ = system.dispatcher

  val routes =
    new GreeterRoute(greeterActor).route

  val rootService = system.actorOf(Props(new RoutedHttpService(routes)))
}
