package teacherstudent;

public class Teacher {

    public void teach(Student student) {
        student.learn();
    }

    public void giveAnswer() {
        System.out.println("the teacher is answering a question");
    }
}
