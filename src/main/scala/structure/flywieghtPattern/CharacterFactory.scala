package structure.flywieghtPattern

import java.lang

object CharacterFactory:
  private var characterCache: Map[String, Character] = Map.empty

  def getCharacter(characterType: String): Character =
    characterCache.getOrElse(characterType, createCharacter(characterType))

  def createCharacter(characterType: String): Character =
    characterType match
      case "goblin" => Goblin()
      case _ => throw IllegalArgumentException(s"Unsupported character type: $characterType")