import uriSchemeHandler.URISchemeHandler

import java.net.URI

object MagnetLink {
  def getMagnetLink(magnetLink: String) = {
    val magnetLinkUri = new URI(magnetLink);
    val uriSchemeHandler = new URISchemeHandler();
    uriSchemeHandler.open(magnetLinkUri);
  }
}
