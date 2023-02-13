import java.util.ArrayList;

public class StudentList
{
   public static void main(String[] args)
   {
        ArrayList<Student> roster = new ArrayList<Student>();
        roster.add(new Student("Sophie", "sophie@myschool.com", 123456));
        roster.add(new Student("Anais", "anais@myschool.com", 789012));
        for (Student student: roster){
            System.out.println(student.toString());
        }
   }
 }

class Student
{
   private String name;
   private String email;
   private int id;

   public Student(String initName, String initEmail, int initId)
   {
      name = initName;
      email = initEmail;
      id = initId;
   }

   public String toString()
   {
     return id + ": " + name + ", " + email;
   }
}
