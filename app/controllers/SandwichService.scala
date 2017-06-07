package controllers

import com.google.inject.ImplementedBy
import models.Sandwich

/**
  * Created by rose on 07/06/2017.
  */
@ImplementedBy(classOf[RealSandwichService])
trait SandwichService {
  def sandwiches() : List[Sandwich]
}
