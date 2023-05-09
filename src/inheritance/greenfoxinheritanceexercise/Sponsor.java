package greenfoxinheritanceexercise;

public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super.setName("Jane Doe");
        super.setAge(30);
        super.setGender("female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() +
                ", a " + getAge() + "year old " + getGender() +
                "who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        this.hiredStudents += 1;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getHiredStudents() {
        return hiredStudents;
    }

    public void setHiredStudents(int hiredStudents) {
        this.hiredStudents = hiredStudents;
    }
}
