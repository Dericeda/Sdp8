public class Project implements IProjectElement{

    IProjectElement[] projectElements;
    public Project(){
        this.projectElements = new IProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(IDeveloper developer){
        for(IProjectElement element: projectElements){
            element.beWritten(developer);
        }
    }
}
