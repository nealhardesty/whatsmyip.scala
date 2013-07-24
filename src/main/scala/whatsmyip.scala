import java.util.regex.Pattern

object whatsmyip {

  def main(args: Array[String])  {
    val ipre = """([\d]{1,3})""".r
    val line = scala.io.Source.fromURL("http://checkip.dyndns.org", "UTF-8").getLines().mkString("\n")
    println (ipre.findAllIn(line).matchData.map({m => m.group(1)}).mkString("."));
  }

}
