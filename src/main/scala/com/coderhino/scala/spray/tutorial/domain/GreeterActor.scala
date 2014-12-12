package com.leadid.scala.spray.tutorial.domain

import akka.actor.{Actor, ActorLogging}

object GreeterActor {
  case class GreetingRequest(msg:String)
  case class GreetingResponse(success:String, msg:String)
}

class GreeterActor extends Actor with ActorLogging {
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
