package models

import play.api.libs.json.Json

case class House(name: String,
                 seat: String,
                 members: List[String])

object House {
  implicit val formats = Json.format[House]
}


case class User(username: String, email: String, age: Int) {
  var id:Int = User.nextId
}

object User {

  private var currentId = 0

  def nextId: Int = {
    currentId += 1
    currentId
  }
}