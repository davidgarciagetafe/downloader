import MagnetLink.getMagnetLink
import Pdf.getpdf
import uriSchemeHandler.URISchemeHandler

import java.net.{URI, URL}
import scala.io.Source

object Main {
  def main(args: Array[String]): Unit = {
    //getpdf("https://torrentgalaxy.to/torrent/14983684/The-Sandman-S01E11-720p-WEBRip-x264-Dual-YG---", "torrent")
    println("Hello world!")
    val url = "http://google.es"
    val serie = "tt1751634"
    val buscarSandman = "https://torrentgalaxy.to/torrent/14983684/The-Sandman-S01E11-720p-WEBRip-x264-Dual-YG---"
    val sandman = getData(buscarSandman)
    /// println(s"a:${sandman.mkString}")

    val pelicula = "tt10648342"
    val urlBase = s"https://torrentgalaxy.to"
    val buscar = s"/torrents.php?search=$pelicula&lang=6&nox=2#results"
    val a = getData(urlBase.concat(buscar))
    //println(s"a:${a.mkString}")

    val whatsapp = "https://web.whatsapp.com/"
    val whatsappData = getData(whatsapp)
    //println(s"whatsapp")
    //println(whatsappData.mkString)
val minionsmagnet = "magnet:?xt=urn:btih:a53f13f8117c5effd6a8b944c0422870bae842a7&dn=Minions.The.Rise.of.Gru.2022.SPANiSH.1080p.BluRay.x264-dem3nt3&tr=udp%3A%2F%2Fopen.stealth.si%3A80%2Fannounce&tr=udp%3A%2F%2Fexodus.desync.com%3A6969%2Fannounce&tr=udp%3A%2F%2Ftracker.cyberia.is%3A6969%2Fannounce&tr=udp%3A%2F%2Ftracker.opentrackr.org%3A1337%2Fannounce&tr=udp%3A%2F%2Ftracker.torrent.eu.org%3A451%2Fannounce&tr=udp%3A%2F%2Fexplodie.org%3A6969%2Fannounce&tr=udp%3A%2F%2Ftracker.birkenwald.de%3A6969%2Fannounce&tr=udp%3A%2F%2Ftracker.moeking.me%3A6969%2Fannounce&tr=udp%3A%2F%2Fipv4.tracker.harry.lu%3A80%2Fannounce&tr=udp%3A%2F%2F9.rarbg.me%3A2970%2Fannounce"
    val minionsTorrent = "https://watercache.nanobytes.org/get/346867207ba0c193ad3b7800e836d08e13567f24/Minions.The.Rise.of.Gru.2022.1080p.AMZN.WEBRip.DDP5.1.Atmos.x264-Dual.YG%E2%AD%90"
    getMagnetLink(minionsmagnet)
    // getData(minionsMagnet)
  }


    //URISchemeHandler uriSchemeHandler = new URISchemeHandler();
    //uriSchemeHandler.open(magnetLinkUri);  }
    // https://torrentgalaxy.to/torrent/14983684/The-Sandman-S01E11-720p-WEBRip-x264-Dual-YG---
    //https://watercache.nanobytes.org/get/0bf76c6dd0720ec48996f2405a515e6930049019/The+Sandman+S01E11+720p+WEBRip+x264-Dual+YG%E2%AD%90
    //magnet:?xt=urn:btih:0bf76c6dd0720ec48996f2405a515e6930049019&dn=The%20Sandman%20S01E11%20720p%20WEBRip%20x264-Dual%20YG%E2%AD%90&tr=udp%3A%2F%2Fopen.stealth.si%3A80%2Fannounce&tr=udp%3A%2F%2Fexodus.desync.com%3A6969%2Fannounce&tr=udp%3A%2F%2Ftracker.cyberia.is%3A6969%2Fannounce&tr=udp%3A%2F%2Ftracker.opentrackr.org%3A1337%2Fannounce&tr=udp%3A%2F%2Ftracker.torrent.eu.org%3A451%2Fannounce&tr=udp%3A%2F%2Fexplodie.org%3A6969%2Fannounce&tr=udp%3A%2F%2Ftracker.birkenwald.de%3A6969%2Fannounce&tr=udp%3A%2F%2Ftracker.moeking.me%3A6969%2Fannounce&tr=udp%3A%2F%2Fipv4.tracker.harry.lu%3A80%2Fannounce&tr=udp%3A%2F%2F9.rarbg.me%3A2970%2Fannounce
    private def getData(buscar: String) = {
      Source.fromURL(buscar)("ISO-8859-1")
    }



}