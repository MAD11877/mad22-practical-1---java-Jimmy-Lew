import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int triangleBase = in.nextInt();
    String character = "*";
    

    for (int end = 0; triangleBase > end ; triangleBase--) {
      System.out.println(character.repeat(triangleBase));
    }
  }
}
