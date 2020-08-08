public class Mentor extends Person {

    public Mentor(String name, String familyName, int age) {
        super(name, familyName, age);
    }

    public static void checkTask(){

    }

    public static void holdMeeting(){

    }

    public static void giveUsefulInformation(){

    }

    public static void giveMotivation(){

    }

    @Override
    public String toString() {
        return "Mentor{" +
                "name='" + getName() + '\'' +
                ", familyName='" + getFamilyName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
