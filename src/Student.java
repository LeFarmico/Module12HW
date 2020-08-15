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
            System.out.println("Задание " + task.getNumber() + " выполнено!");
            completedTasks++;
            totalTasksCompleted++;
        }
        else if (task instanceof WriteCode){
            while (true) {
                if (mentor.checkCode(task)) {
                    completedTasks++;
                    totalTasksCompleted++;
                    break;
                }
            }
        }
    }

    public void solveTasks(int numberOfTasksToComplete, Task[] tasks){
        System.out.println("Надо решить: " + numberOfTasksToComplete + " задач из: " + tasks.length);
        if (numberOfTasksToComplete > tasks.length){
            System.out.println("Задач должно быть меньше чем " + tasks.length);
        }
        else {
            for (int i = 0; i < numberOfTasksToComplete; i++) {
                solveTask(tasks[i]);
            }
            allTasksCompleted = (completedTasks == tasks.length);
        }
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
