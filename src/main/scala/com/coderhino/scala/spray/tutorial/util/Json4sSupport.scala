package com.coderhino.scala.spray.tutorial.util

import org.json4s._
import org.json4s.jackson.Serialization
import spray.httpx.Json4sJacksonSupport

object Json4sSupport extends Json4sJacksonSupport {
  override implicit def json4sJacksonFormats: Formats = Serialization.formats(NoTypeHints)

  def toJValue[T](value:T):JValue = {
    Extraction.decompose(value)
  }
}
