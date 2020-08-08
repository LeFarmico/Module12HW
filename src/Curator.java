public class Curator extends Person {

    public Curator(String name, String familyName, int age){
        super(name, familyName, age);
    }

    public static void answerQuestion(){

    }

    public static void giveAdvise(){

    }

    public static void giveMotivation(){

    }

    @Override
    public String toString() {
        return "Curator{" +
                "name='" + getName() + '\'' +
                ", familyName='" + getFamilyName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
