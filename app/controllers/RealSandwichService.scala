package controllers

import models.Sandwich

/**
  * Created by rose on 07/06/2017.
  */
class RealSandwichService extends SandwichService {
  //just an empty list
  override def sandwiches(): List[Sandwich] = List()
}
