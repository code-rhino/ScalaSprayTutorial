package com.leadid.scala.spray.tutorial

import com.leadid.scala.spray.core.{CoreActors, BootedCore}
import com.leadid.scala.spray.tutorial.api.Api
import com.leadid.scala.spray.tutorial.core.Web


object Boot extends App with BootedCore with CoreActors with Api with Web