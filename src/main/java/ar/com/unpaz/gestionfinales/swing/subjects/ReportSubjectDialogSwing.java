package ar.com.unpaz.gestionfinales.swing.subjects;

import java.io.File;
import javax.swing.JFileChooser;
import ar.com.unpaz.gestionfinales.presentation.ReportDialog;
import ar.com.unpaz.gestionfinales.usecase.DialogController;

public class ReportSubjectDialogSwing implements ReportDialog {

  private static final String TITLE = "Ubicacion de Reporte de Materias";
  private JFileChooser chooser;
  private File fileSelected;
  private DialogController controller;

  public ReportSubjectDialogSwing() {
    chooser = new JFileChooser();
    chooser.setDialogTitle(TITLE);
  }

  @Override
  public void setController(DialogController controller) {
    this.controller = controller;
  }

  @Override
  public void show() {
    if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
      fileSelected = chooser.getSelectedFile();
      controller.accept();
    }
  }

  @Override
  public File getFile() {
    return fileSelected;
  }

  @Override
  public void close() {}

}
