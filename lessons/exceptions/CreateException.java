public class CreateException {
    public static void main(String[] args) { 
        try{
            CheckAge c = new CheckAge();
            c.check(15);
        }catch(Exception e){
            System.out.println("Exception was found.");
            e.printStackTrace();
        }
    }
} 
 
class CheckAge{
    public void check(int age) throws Exception{
        if(age < 18){
            throw new Exception("Access denied - You must be at least 18 years old.");
        }else{
            System.out.println("Access granted - You are old enough!");
        }
    }
}