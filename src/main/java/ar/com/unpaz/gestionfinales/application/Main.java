package ar.com.unpaz.gestionfinales.application;

import ar.com.unpaz.gestionfinales.database.AppRepositoryContext;
import ar.com.unpaz.gestionfinales.inmemory.finals.InMemoryFinalRepository;
import ar.com.unpaz.gestionfinales.inmemory.students.InMemoryStudentRepository;
import ar.com.unpaz.gestionfinales.inmemory.subjects.InMemorySubjectRepository;
import ar.com.unpaz.gestionfinales.plaintext.PlainTextStudentReport;
import ar.com.unpaz.gestionfinales.plaintext.PlainTextSubjectReport;
import ar.com.unpaz.gestionfinales.presentation.AppViewContext;
import ar.com.unpaz.gestionfinales.reports.AppReportContext;
import ar.com.unpaz.gestionfinales.swing.AppViewSwing;
import ar.com.unpaz.gestionfinales.swing.finals.AddFinalDialogSwing;
import ar.com.unpaz.gestionfinales.swing.finals.DeleteFinalDialogSwing;
import ar.com.unpaz.gestionfinales.swing.finals.FinalViewSwing;
import ar.com.unpaz.gestionfinales.swing.finals.UpdateFinalDialogSwing;
import ar.com.unpaz.gestionfinales.swing.students.AddStudentDialogSwing;
import ar.com.unpaz.gestionfinales.swing.students.DeleteStudentDialogSwing;
import ar.com.unpaz.gestionfinales.swing.students.SelectStudentDialogSwing;
import ar.com.unpaz.gestionfinales.swing.students.StudentsViewSwing;
import ar.com.unpaz.gestionfinales.swing.students.UpdateStudentDialogSwing;
import ar.com.unpaz.gestionfinales.swing.subjects.AddSubjectDialogSwing;
import ar.com.unpaz.gestionfinales.swing.subjects.DeleteSubjectDialogSwing;
import ar.com.unpaz.gestionfinales.swing.subjects.ReportSubjectDialogSwing;
import ar.com.unpaz.gestionfinales.swing.subjects.SelectSubjectDialogSwing;
import ar.com.unpaz.gestionfinales.swing.subjects.SubjectsViewSwing;
import ar.com.unpaz.gestionfinales.swing.subjects.UpdateSubjectDialogSwing;
import ar.com.unpaz.gestionfinales.usecase.AppControllerContext;
import ar.com.unpaz.gestionfinales.usecase.AppControllerImpl;
import ar.com.unpaz.gestionfinales.usecase.finals.FinalControllerImpl;
import ar.com.unpaz.gestionfinales.usecase.students.StudentControllerImpl;
import ar.com.unpaz.gestionfinales.usecase.subjects.SubjecControllerImpl;

public class Main {

  public static void main(String[] args) {

    AppRepositoryContext.subjectRepository = new InMemorySubjectRepository();
    AppRepositoryContext.studentRepository = new InMemoryStudentRepository();
    AppRepositoryContext.finalRepository = new InMemoryFinalRepository();

    AppReportContext.subjectReport = new PlainTextSubjectReport();
    AppReportContext.studentReport = new PlainTextStudentReport();
    
    AppViewContext.appView = new AppViewSwing();
    AppViewContext.subjectsView = new SubjectsViewSwing();
    AppViewContext.addSubjectDialog = new AddSubjectDialogSwing();
    AppViewContext.updSubjectDialog = new UpdateSubjectDialogSwing();
    AppViewContext.delSubjectDialog = new DeleteSubjectDialogSwing();
    AppViewContext.reportSubjectDialog = new ReportSubjectDialogSwing();

    AppViewContext.studentsView = new StudentsViewSwing();
    AppViewContext.addStudentDialog = new AddStudentDialogSwing();
    AppViewContext.updStudentDialog = new UpdateStudentDialogSwing();
    AppViewContext.delStudentDialog = new DeleteStudentDialogSwing();
    AppViewContext.reportStudentDialog = new ReportSubjectDialogSwing();

    AppViewContext.finalsView = new FinalViewSwing();
    AppViewContext.addFinalDialog = new AddFinalDialogSwing();
    AppViewContext.updFinalDialog = new UpdateFinalDialogSwing();
    AppViewContext.delFinalDialog = new DeleteFinalDialogSwing();
    AppViewContext.selectStudentDialog = new SelectStudentDialogSwing();
    AppViewContext.selectSubjectDialog = new SelectSubjectDialogSwing();

    AppControllerContext.appController = new AppControllerImpl();
    AppControllerContext.subjectController = new SubjecControllerImpl();
    AppControllerContext.studentController = new StudentControllerImpl();
    AppControllerContext.finalController = new FinalControllerImpl();

    AppControllerContext.appController.startApp();

  }
}
