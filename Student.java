public class Student {
    String name;
    int roll_no;
    
}
class Teacher{
    
    public static void main(String[] args) {
        Student Istudent = new Student();
        Istudent.name = "John";
        Istudent.roll_no = 2;
        if(Istudent.name.equals("John") && (Istudent.roll_no == 2)){
        System.out.println("You code it right");
    }
    }
    
}
