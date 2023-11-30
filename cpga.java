import java.util.*;
class CGPA_2
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    float Result = 0,Credit_Total= 0;
    System.out.println("Calculating CGPA");
    System.out.print("Enter the Number of Subjects : ");
    int Number_of_Subjects = sc.nextInt();
    for (int i=1;i<=Number_of_Subjects;i++ )
    {
        System.out.println("Enter "+i+" Subject Grade Point : ");
        float Grade = sc.nextFloat();
        System.out.println("Enter "+i+" Subject Credit Point : ");
        float Credit = sc.nextFloat();
        Credit_Total+=Credit;
        Result+=(Grade*Credit);
    }
    float CGPA = Result/Credit_Total;
    System.out.println("Your CGPA IS "+CGPA);
    sc.close();
}
}
