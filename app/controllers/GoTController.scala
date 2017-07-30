package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc._
import com.github.tototoshi.play2.scalate._
import models.House
import services.GoTService



@Singleton
class GoTController @Inject()(scalate: Scalate, gotService: GoTService) extends Controller {

  def viewMustache(name: String) = Action { implicit request =>
    gotService.findHouse(name) match {
      case Some(h) =>
        Ok(scalate.render("showGot.mustache",
          Map("house?" -> populateShowGotView(h))))
      case None =>
        Ok(scalate.render("showGot.mustache",
          Map("house?" -> Nil)))
    }
  }

  def viewTwirl(name: String) = Action {
    implicit request =>
      Ok(views.html.showGoT(gotService.findHouse(name)))
  }

  private def populateShowGotView(house: House) = Map("name" -> house.name,
    "seat" -> house.seat,
    "members" -> house.members)

}