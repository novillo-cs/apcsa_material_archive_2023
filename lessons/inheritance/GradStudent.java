public class GradStudent extends Student {
    // additional data member
    private int gradID;

    // contructor
    public GradStudent() {
        super();
        gradID = 0;
    }

    // constructor
    public GradStudent(String studName, int[] studTests, String studGrade, int gradStudID) {
        super(studName, studTests, studGrade);
        gradID = gradStudID;
    }

    // additional public method
    public int getID() {
        return gradID;
    }

    // overridden method
    @Override
    public void computeGrade() {
        System.out.println(getGrade());
        if (getTestAverage() >= 90)
            setGrade("Pass with distinction");
    }
}