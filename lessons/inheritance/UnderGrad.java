public class UnderGrad extends Student {
    // contructor
    public UnderGrad() {
        super();
    }

    // constructor
    public UnderGrad(String studName, int[] studTests, String studGrade) {
        super(studName, studTests, studGrade);
    }

    // overridden method
    public void computeGrade() {
        if (getTestAverage() >= 70)
            setGrade("Pass");
        else
            setGrade("Fail");
    }
}