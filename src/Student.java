public class Student extends  Person {
    private  int id;
    private  int group;
    private  int tasksFinished;
    private  int currentModule;
    private  boolean experience;
    private  static int allCompletedTasks;
    private  static int maxModuleOfAllStudents;
    public   static final int MAX_MODULE = 10;

    public Student(String name, String familyName, int age) {
        super(name, familyName, age);
        this.id = id;
        this.group = group;
        this.tasksFinished = tasksFinished;
        this.currentModule = currentModule;
        this.experience = experience;
    }

    public void doTask (){
        System.out.println("taskTypes.Task completed!");
        maxModuleOfAllStudents++;
        allCompletedTasks++;
        tasksFinished++;

    }
    private static void askQuestion (){
        //Method's body
    }
    private void completeModule (){
        if (currentModule < MAX_MODULE){
            currentModule++;
            System.out.println("Module completed!");
        }
        else System.out.println("All modules completed!");

        if (maxModuleOfAllStudents < currentModule)
            maxModuleOfAllStudents = currentModule;
    }
    private static void connectToMentor (){
        //Method's body
    }
    private static void findTask (){
        //Method's body
    }
    private static void connectToClassmate (){
        //Method's body
    }
}
