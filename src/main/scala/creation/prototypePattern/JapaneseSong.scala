package creation.prototypePattern

case class JapaneseSong(val name: String, val owner: String) extends Song:
  override def clone(newName: String): JapaneseSong = JapaneseSong(newName, owner)

  override def toString: String = s"song: $name, artist: $owner"
