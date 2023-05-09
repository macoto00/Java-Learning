package cloneable;

public class Student extends Person implements Cloneable {

    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        setSkippedDays(0);
    }

    public Student() {
        super.setName("Jane Doe");
        super.setAge(30);
        super.setGender("female");
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " +
                getGender() + " from " + previousOrganization + " who skipped " +
                skippedDays + " days from the course already.");
    }

    @Override
    public Student clone() {
        return new Student(getName(), getAge(), getGender(), getPreviousOrganization());
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    public void setPreviousOrganization(String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }

    public void setSkippedDays(int skippedDays) {
        this.skippedDays = skippedDays;
    }

}
