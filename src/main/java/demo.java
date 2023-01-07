public class demo {
    public static void main(String[] args) {
        Student priya=Student.setDetails("priya",16,"female");
        Student lav=Student.setDetails("lav",70,"female");
        Student j = Student.setDetails("Jagan S", 9, "male");

        Student v = Student.setDetails("Vinod S", 50, "male");


        Student[] students = {priya, lav,j,v };

        for(int i = 0; i < students.length ; i++){

            if(students[i].sex == "female" || students[i].age > 40){

                Student.printDetails(students[i]);

            }

        }


    }
}
