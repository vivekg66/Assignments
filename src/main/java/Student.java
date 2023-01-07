public class Student {

    public String name;
    public int age;
    public String sex;


    public  static Student setDetails(String name, int age, String sex){
        Student s=new Student();
        s.name=name;
        s.age=age;
        s.sex=sex;
        return s;
    }

    public static String getStudentType(int age){
        Student s=new Student();
        if(s.age > 65){

            return "senior";

        }

        else if (s.age > 12 && s.age < 20){

            return "teenager";

        }

	else {

            return "regular";

        }

    }

    public static void printDetails(Student student){

        String studentType = getStudentType(student.age);

        System.out.println(student.name + " is a " + studentType +" student");

    }


    }

