package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}


/**
  * Created by rose on 07/06/2017.
  */
class SandwichController @Inject()(sandwichService: SandwichService) extends Controller{
  def sandwiches() = Action {
    val sandwiches = sandwichService.sandwiches
    Ok(views.html.sandwiches(sandwiches))
  }
}
