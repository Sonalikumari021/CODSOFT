import java.util.*; 

  public class Marks {

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter marks of 5 subjects separated by space: ");
          int sub1 = sc.nextInt();
          int sub2 = sc.nextInt(); 
          int sub3 = sc.nextInt();
          int sub4 = sc.nextInt();
          int sub5 = sc.nextInt();

          int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
          float averagePercentage = totalMarks / 5f;

          String grade;
          if(averagePercentage >= 90){
              grade = "A"; 
          }
          else if(averagePercentage >= 80){
              grade = "B";
          }
          else if(averagePercentage >= 70){
              grade = "C";  
          }
          else if(averagePercentage >= 60){
              grade = "D";  
          }
          else if (averagePercentage>=40){
              grade = "E";
          }
	else{
	grade ="f";
	}

          System.out.println("Total Marks: " + totalMarks);   
          System.out.println("Average Percentage: " + averagePercentage);
          System.out.println("Grade: " + grade);
      }
  }
