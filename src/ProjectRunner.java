public class ProjectRunner  {
    public static void main(String[] args){
        Project project = new Project();

        IDeveloper junior = new JuniorDeveloper();
        IDeveloper senior = new SeniorDeveloper();

        System.out.println("Junior in Action...");
        project.beWritten(junior);

        System.out.println("Senior in Action...");
        project.beWritten(senior);
    }

}
