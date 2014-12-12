package com.leadid.scala.spray.tutorial.api

import akka.actor.Props
import com.leadid.scala.spray.core.{Core, CoreActors}
import com.leadid.scala.spray.tutorial.route.GreeterRoute
import com.leadid.scala.spray.util.Services.RoutedHttpService
import spray.routing.RouteConcatenation

trait Api extends RouteConcatenation {
  this: CoreActors with Core =>
    private implicit val _ = system.dispatcher

  val routes =
    new GreeterRoute(greeterActor).route

  val rootService = system.actorOf(Props(new RoutedHttpService(routes)))
}
