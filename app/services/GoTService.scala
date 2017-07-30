package services

import javax.inject.Singleton

import models.House

import scala.concurrent.Future


@Singleton
class GoTService {

  def findHouse(memberName: String): Option[House] = {
    memberName match {
      case "tyrion" =>
        Some(House("House Lannister", "Casterly Rock", List("Tywin Lannister", "Cersei Lannister", "Jamie Lannister")))
      case "arya" =>
        Some(House("House Stark", "Winterfell", List("Robb Stark", "Eddard Stark", "Catelyn Stark")))
      case "robert" =>
        Some(House("House Baratheon", "Stormlands", List("Stannis Baratheon", "Renly Baratheon", "Shireen Baratheon")))
      case _ => None
    }
  }

}
