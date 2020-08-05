public class Student {
    private  int id;
    private  String name;
    private  String familyName;
    private  int age;
    private  int group;
    private  int tasksFinished;
    private  int currentModule;
    private  boolean experience;
    private  static int allCompletedTasks;
    private  static int maxModuleOfAllStudents;
    public   static final int MAX_MODULE = 10;

    public Student(String name, String familyName, int age) {
        this(0, 0, 0, 0, false);
        this.name = name;
        this.familyName = familyName;
        this.age = age;
    }

    public Student(int id, int group, int tasksFinished, int currentModule, boolean experience) {
        this.id = id;
        this.group = group;
        this.tasksFinished = tasksFinished;
        this.currentModule = currentModule;
        this.experience = experience;
    }


    public void doTask (){
        System.out.println("Task completed!");
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
