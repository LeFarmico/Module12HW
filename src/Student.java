import taskTypes.DragAndDrop;
import taskTypes.Task;
import taskTypes.Test;
import taskTypes.WriteCode;

import java.util.Objects;

public class Student extends  Person {

    private  int completedTasks;
    private  static int totalTasksCompleted;
    private  boolean allTasksCompleted;
    private  Mentor mentor;

    public Student(String name, String familyName, int age, Mentor mentor) {
        super(name, familyName, age);
        this.completedTasks = 0;
        this.mentor = mentor;
    }

    private void solveTask (Task task){
        if((task instanceof Test) || (task instanceof DragAndDrop)){
            System.out.println("Задание выполнено!");
            completedTasks++;
            totalTasksCompleted++;
        }
        else if (task instanceof WriteCode){
            if(mentor.checkCode(task)){
                System.out.println("Задание зачтено!");
                completedTasks++;
                totalTasksCompleted++;
            }
            else mentor.checkCode(task);
            // Как отправлять повторно? Отдельный метод?
        }
    }

    public void solveTasks(int numberOfTasks, Task[] tasks){
        for (int i = completedTasks; i < tasks.length; i++) {
            solveTask(tasks[completedTasks+1]);
        }
        allTasksCompleted = (completedTasks == tasks.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return  getName().equals(student.getName()) &&
                getFamilyName().equals(student.getFamilyName()) &&
                getAge() == student.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFamilyName(), getAge());
    }

    @Override
    public String toString() {
        return "Student{" +
                ", completedTasks=" + completedTasks +
                ", name=" + getName() +
                ", familyName=" + getFamilyName() +
                ", age=" + getAge() +
                ", mentor=" + mentor +
                '}';
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public static int getTotalTasksCompleted() {
        return totalTasksCompleted;
    }

    public boolean isAllTasksCompleted() {
        return allTasksCompleted;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setCompletedTasks(int completedTasks) {
        this.completedTasks = completedTasks;
    }

    public static void setTotalTasksCompleted(int totalTasksCompleted) {
        Student.totalTasksCompleted = totalTasksCompleted;
    }

    public void setAllTasksCompleted(boolean allTasksCompleted) {
        this.allTasksCompleted = allTasksCompleted;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }
}
