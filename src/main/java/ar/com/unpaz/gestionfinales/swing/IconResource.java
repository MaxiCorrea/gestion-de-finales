package ar.com.unpaz.gestionfinales.swing;

import static java.lang.String.valueOf;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class IconResource {

  private IconResource() {
    throw new AssertionError();
  }

  public static Icon load(IconPathOf path) {
    return new ImageIcon(IconResource.class.getClass().getResource(valueOf(path)));
  }

  public static enum IconPathOf {

    ICON("/images/icon.png"),
    
    BACKGROUND("/images/unpaz.png"),
    
    GITHUB("/images/github.png"),
    
    LINKEDIN("/images/linkedin.png");
    
    private String path;

    private IconPathOf(String path) {
      this.path = path;
    }

    @Override
    public String toString() {
      return path;
    }

  }

}
