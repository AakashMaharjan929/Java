public class Student {
    private String name;
    private String className;
    private int rollNumber;
    private int[] marks;

    public Student(String name, String className, int rollNumber, int[] marks) {
        this.name = name;
        this.className = className;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double calculatePercentage() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }

    public double calculateGPA() {
        double totalGPA = 0;
        for (int mark : marks) {
            if (mark >= 90) {
                totalGPA += 4.0;
            } else if (mark >= 80) {
                totalGPA += 3.0;
            } else if (mark >= 70) {
                totalGPA += 2.0;
            } else if (mark >= 60) {
                totalGPA += 1.0;
            }
        }
        return totalGPA / marks.length;
    }



    public static void main(String[] args) {
        int[] marks = {80, 75, 90, 85, 95};
        Student student = new Student("Ram", "Class 10", 1, marks);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Class: " + student.getClassName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Percentage: " + student.calculatePercentage());
        System.out.println("GPA: " + student.calculateGPA());
    }

}