package com.leadid.scala.spray.core

import akka.actor.ActorSystem
import akka.actor.Props
import com.leadid.scala.spray.tutorial.domain.GreeterActor

trait Core {
  implicit def system:ActorSystem
}

trait BootedCore extends Core {
  implicit lazy val system = ActorSystem("spray-system")
  sys.addShutdownHook(system.shutdown())
}

trait CoreActors {
  this: Core =>

  val greeterActor = system.actorOf(Props[GreeterActor])
}
