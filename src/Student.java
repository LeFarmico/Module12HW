import java.util.Objects;

public class Student extends  Person {
    private  int courseName;
    private  int group;
    private  int tasksFinished;
    private  int currentModule;
    private  boolean experience;
    private  static int allCompletedTasks;
    private  static int maxModuleOfAllStudents;
    public   static final int MAX_MODULE = 10;

    public Student(String name, String familyName, int age) {
        super(name, familyName, age);
        this.courseName = courseName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return courseName == student.courseName &&
                experience == student.experience &&
                getName().equals(student.getName()) &&
                getFamilyName().equals(student.getFamilyName()) &&
                getAge() == student.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, experience, getName(), getFamilyName(), getAge());
    }

    public static void main(String[] args) {
        Student student1 = new Student("Федя", "Бобров", 32);
        Student student2 = new Student("Федя", "Бобров", 32);

        long s1Hash = student1.hashCode();
        long s2Hash = student2.hashCode();
        System.out.println(s1Hash + " " + s2Hash);
        System.out.println(student1.equals(student2));
        System.out.println(student1.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "courseName=" + courseName +
                ", group=" + group +
                ", tasksFinished=" + tasksFinished +
                ", currentModule=" + currentModule +
                ", experience=" + experience +
                ", name=" + getName() +
                ", familyName=" + getFamilyName() +
                ", age=" + getAge() +
                '}';
    }
}
