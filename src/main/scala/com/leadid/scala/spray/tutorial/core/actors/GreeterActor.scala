package com.leadid.scala.spray.tutorial.core.actors

import akka.actor.{ActorLogging, Actor}

object GreeterActor {
  case class GreetingRequest(msg:String)
  case class GreetingResponse(success:String, msg:String)
}

class GreeterActor extends Actor with ActorLogging {
  import com.leadid.scala.spray.tutorial.core.actors.GreeterActor._
  def receive:Receive = {
    case GreetingRequest(msg) => {
      log.debug("A Greeting Request was made")
      sender ! GreetingResponse("success",msg)
    }
    case _ =>{
      log.error("Bullshit!")
    }
  }
}
