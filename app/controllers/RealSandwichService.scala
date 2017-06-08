package controllers

import models.Sandwich
import uk.gov.hmrc.play.http.HeaderCarrier
import uk.gov.hmrc.play.http.ws.WSGet

import scala.concurrent.Future
//default execution context https://www.playframework.com/documentation/2.5.x/ScalaAsync
import play.api.libs.concurrent.Execution.Implicits.defaultContext

/**
  * Created by rose on 07/06/2017.
  */
class RealSandwichService extends SandwichService {

  val http = new WSGet {
    override val hooks = NoneRequired
  }

  override def sandwiches: Future[List[Sandwich]] = {
    implicit val hc = HeaderCarrier()
    http.GET[List[Sandwich]]("http://46.101.73.211:3000/sandwiches")
  }
}
