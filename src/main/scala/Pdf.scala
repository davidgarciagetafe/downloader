import java.net.URL
import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
object Pdf {
  /**
   *
   * @param url url of file pdf to download
   * @param location location and name to save pdf
   * @return
   */
  def getpdf(url : String, location : String)={

    val enlace = " https://www.aquabeadsart.com/assets/common/img/templates/pdf/a4/860.pdf"
    val urlOpen = new URL(url)
    try {
      val in = urlOpen.openStream()

      try Files.copy(in, Paths.get(location), StandardCopyOption.REPLACE_EXISTING)
      catch {
        case e: IOException =>

        // handle exception
      } finally if (in != null) in.close()
    }
  }
}
