public class Test
{
    public static void print(Student [] student){
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i].mark + " (" + student[i].name + ")");
        }
    }
    // Add a static print mthod to this class.
}