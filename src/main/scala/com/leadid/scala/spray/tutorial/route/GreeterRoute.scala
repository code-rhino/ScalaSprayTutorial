package com.leadid.scala.spray.tutorial.route

import akka.pattern.ask
import akka.actor.ActorRef
import com.leadid.scala.spray.tutorial.core.actors.GreeterActor._
import spray.http.{HttpResponse,StatusCode, StatusCodes}
import com.leadid.scala.spray.tutorial.route.RouteImplicits._
import spray.routing.{RequestContext, Directives}
import scala.concurrent.ExecutionContext

class GreeterRoute(greetingActor:ActorRef)(implicit executionContext:ExecutionContext) extends Directives {
  import Json4sSupport._

  val route = greetingRoute

  def greetingRoute = path("greet-me") {
    post {
      entity(as[GreetingRequest]) {
        gr:GreetingRequest =>
          ctx: RequestContext => {
            ctx.complete {
              greetingActor ? gr map {
                case response @ GreetingResponse(success, msg) => (StatusCodes.OK, response)
              }
            }
          }
      }
    }
  }
}