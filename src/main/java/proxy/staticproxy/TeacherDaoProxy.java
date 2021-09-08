package proxy.staticproxy;

public class TeacherDaoProxy implements  ITeacherDao {

    private ITeacherDao targer;

    public TeacherDaoProxy(ITeacherDao targer) {
        this.targer = targer;
    }

    @Override
    public void teach() {
        System.out.println("TeeacherDaoProxy");
        targer.teach();
    }
}
