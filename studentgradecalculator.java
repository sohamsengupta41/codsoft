import java.util.Scanner;

public class studentgradecalculator
{
public static void main (String[]args)
{
Scanner sc = new Scanner (System.in);

  System.out.println ("Enter the number of subjects : ");
int numsubjects = sc.nextInt ();

int totalmarks = 0;
for (int i = 1; i <= numsubjects; i++)
  {
System.out.println ("The number of marks obtained in  " + i +
		    " is : ");
int marks = sc.nextInt ();
  totalmarks += marks;
  }

double average = (double) totalmarks / numsubjects;


String grade;
if (average >= 90)
  {
grade = "O";
  }
else if (average >= 80)
  {
grade = "A";
  }
else if (average >= 70)
  {
grade = "B";
  }
else if (average >= 60)
  {
grade = "C";
  }
else if (average >= 50)
  {
grade = "D";
  }
else
  {
grade = "F";
  }

System.out.println ("Total Marks is : " + totalmarks);
System.out.println ("Average is : " + average);
System.out.println ("Grade is : " + grade);
}
}