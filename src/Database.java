public class Database implements IProjectElement{
    @Override
    public void beWritten(IDeveloper developer){
        developer.create(this);
    }
}
