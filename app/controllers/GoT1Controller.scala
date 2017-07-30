package controllers

import javax.inject.{Inject, Singleton}

import com.github.tototoshi.play2.scalate._
import play.api.data.Form
import play.api.data.Forms.text
import play.api.mvc._


@Singleton
class GoT1Controller @Inject()(scalate: Scalate) extends Controller {

  def view = Action { implicit request =>
    Ok(scalate.render("findGot.mustache", Map("text" -> "Hello")))
  }

  def submit = Action {implicit request =>
    val searchName = Form("searchName" -> text).bindFromRequest.get
    Redirect(controllers.routes.GoTController.viewTwirl(searchName))
  }

}