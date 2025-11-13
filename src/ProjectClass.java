public class ProjectClass implements IProjectElement{
    @Override
    public void beWritten(IDeveloper developer){
        developer.create(this);

    }
}
