import model.Student;

public class TestClass {
    public static void main(String[] args) {
        Student student = new Student("Richard", 22, 1, "201841413136");
        System.out.printf("Student attrs: \n" +
                "name: %s\n" +
                "age: %d\n" +
                "gender: %s\n" +
                "student_id: %s\n",
                student.getName(),
                student.getAge(),
                student.getGender() == 1?"男":"女",
                student.getId_no());
    }
}
