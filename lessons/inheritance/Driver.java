public class Driver {
    public static void main(String args[]) {
        int[] tests = {100, 89, 90, 100, 100};
        Student StudentOne = new GradStudent("Jessica", tests, "A", 28);
        System.out.println(StudentOne.getName());
        StudentOne.computeGrade();
        System.out.println(StudentOne.getGrade());
    }
}
