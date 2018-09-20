import java.util.Scanner;

public class StudentsMarks {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("enter the number of students");
     int noOfStudents = input.nextInt();
    System.out.println("enter the students grade");
    int [] studentsGrade= new int[noOfStudents];
    for (int i=0;i<noOfStudents;i++)
    studentsGrade[i]=input.nextInt();
    System.out.println(grade(studentsGrade,noOfStudents));

  }


   public static String grade(int[] stdGrade, int stdnum){
     try {
       for(int i=0;i<stdnum;i++){
         if(stdGrade[i]<0 || stdGrade[i]>100){
         throw new Exception("grade is not in range" + stdGrade[i]);
         }

     }


     }
     catch (Exception e){
       return (e.getMessage());
     }
   return null;

  }




}
