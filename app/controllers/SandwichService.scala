package controllers

import com.google.inject.ImplementedBy
import models.Sandwich
import scala.concurrent.Future

/**
  * Created by rose on 07/06/2017.
  */
@ImplementedBy(classOf[RealSandwichService])
trait SandwichService {
  def sandwiches() : Future[List[Sandwich]]
}
