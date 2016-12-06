//import java.util.Scanner;
public class GradeBookTest
{ 
   // main method begins program execution
   public static void main(String[] args)
   {
      GradeBook myGradeBook = new GradeBook(
         "CS101 Introduction to Java Programming", "GradeBookData.txt");
      System.out.printf("Welcome to the grade book for%n%s%n%n", 
         myGradeBook.getCourseName());
      myGradeBook.processGrades();
   } 
}