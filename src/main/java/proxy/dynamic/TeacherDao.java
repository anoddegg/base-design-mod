package proxy.dynamic;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师在授课");
    }

    @Override
    public void teach2(int i) {
        System.out.println("老师在授课" + i);
    }
}
