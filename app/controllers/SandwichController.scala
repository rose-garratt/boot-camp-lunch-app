package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}
//default execution context https://www.playframework.com/documentation/2.5.x/ScalaAsync
import play.api.libs.concurrent.Execution.Implicits.defaultContext


/**
  * Created by rose on 07/06/2017.
  */
class SandwichController @Inject()(sandwichService: SandwichService) extends Controller {
  def sandwiches() = Action.async {
    val sandwiches = sandwichService.sandwiches()
    sandwiches.map { listOfSarnies =>
      Ok(views.html.sandwiches(listOfSarnies))
    }
  }
}
