package com.leadid.scala.spray.tutorial.core

import akka.io.IO
import com.leadid.scala.spray.core.{Core, CoreActors}
import com.leadid.scala.spray.tutorial.api.Api
import spray.can.Http

trait Web {
  this: Api with CoreActors with Core =>
  IO(Http)(system) ! Http.Bind(rootService,"0.0.0.0", port = 8080)
}
