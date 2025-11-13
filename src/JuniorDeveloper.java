public class JuniorDeveloper implements IDeveloper {
    private String classMessage = "Writing poor class...";
    private String databaseMessage = "Drop database...";
    private String testMessage = "Creating not reliable test...";


    @Override
    public void create(ProjectClass projectClass){
        System.out.println(classMessage);
    }
    @Override
    public void create(Database database){
        System.out.println(databaseMessage);
    }
    @Override
    public void create(Test test){
        System.out.println(testMessage);
    }

    public void setClassMessage(String message){
        this.classMessage = message;
    }

    public void setDatabaseMessage(String message){
        this.databaseMessage = message;
    }
    public void setTestMessage(String message){
        this.testMessage = message;
    }



}
