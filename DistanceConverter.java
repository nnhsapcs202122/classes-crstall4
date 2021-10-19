import java.util.Scanner;

public class DistanceConverter
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the number of yards to be converted to feet and inches: ");
      double yards = s.nextDouble();
      final double YARD_TO_FEET = 3;
      final double FEET_TO_INCH = 12;
      System.out.println(yards + " yards are " + yards*YARD_TO_FEET + " feet");
      System.out.println(yards + " yards are " + yards*YARD_TO_FEET*FEET_TO_INCH + " inches");
   }
}
