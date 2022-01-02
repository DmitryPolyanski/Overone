package by.oop;

public class Student extends Person {

    private String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    public void getNameAndUniver() {
        System.out.println(getName() + '\n' + university);
    }

 /*   public void setUniversity(String university) {
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }*/




    //    public Student(String name, int age, String university) {
//        super(name, age);
//        this.university = university;
//    }

}
