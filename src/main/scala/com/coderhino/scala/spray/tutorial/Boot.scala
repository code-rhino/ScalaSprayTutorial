package com.coderhino.scala.spray.tutorial

import com.coderhino.scala.spray.tutorial.core.Api
import com.coderhino.scala.spray.core.{CoreActors, BootedCore}
import com.coderhino.scala.spray.tutorial.core.Web


object Boot extends App with BootedCore with CoreActors with Api with Web