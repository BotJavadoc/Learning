package oopslearning;

public class ObjectAndClassesLearning {
    public static void main(String[] args) {
        Student s = new Student("Abhishek", 23, "Banglore", "CSE", 1);
        System.out.println("Name : "+s.name);
        System.out.println("Age : "+s.age);
        System.out.println("Address : "+s.address);
        System.out.println("Roll No : "+s.rollNumber);
        System.out.println("Course : "+s.course);
        ObjectAndClassesLearning obj = new ObjectAndClassesLearning();
        obj.set("CSE");
        obj.get();
    }

public static class Student {
    private String name;
    private int age;
    private String address;
    private String course;
    private int rollNumber;
        public Student( String name, int age, String address, String course, int rollNumber) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.course = course;
            this.rollNumber = rollNumber;
        }
    }
       private String branch;
    public void set(String branch) {
           this.branch = branch;
        }
        public void get() {
            System.out.println("Branch : "+ branch);
        }
}
