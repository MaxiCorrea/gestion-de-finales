package ar.com.unpaz.gestionfinales.usecase;

import ar.com.unpaz.gestionfinales.database.AppRepositoryContext;
import ar.com.unpaz.gestionfinales.presentation.AppViewContext;

public class AppControllerImpl implements AppController {

  @Override
  public void selectedSubjects() {
    AppViewContext.subjectsView.setSubjects(AppRepositoryContext.subjectRepository.getAll());
    AppViewContext.subjectsView.show();
  }

  @Override
  public void selectedStudents() {
    AppViewContext.studentsView.setStudents(AppRepositoryContext.studentRepository.getAll());
    AppViewContext.studentsView.show();
  }

  @Override
  public void selectedFinals() {
    AppViewContext.finalsView.setFinals(AppRepositoryContext.finalRepository.getAll());
    AppViewContext.finalsView.show();
  }

  @Override
  public void selectedAbout() {

  }

  @Override
  public void closeApp() {
    AppViewContext.appView.close();
  }

  @Override
  public void startApp() {
    AppViewContext.appView.show();
  }

}