import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    int lengthOfSet = in.nextInt();

    int[] set = new int[lengthOfSet];

    for (int i = 0; i < lengthOfSet; i++) {
        int userInput = in.nextInt();
        set[i] = userInput;
    }

    System.out.println(mode(set));
  }

  public static int mode(int[] numList) {
    int mode = 0;
    int highestCount = 0;

    for (int i = 0; i < numList.length; i++) {
      int currentValue = numList[i];
      int count = 1;

      for (int j = 0; j < numList.length; j++) {
        if (count > highestCount) {
          highestCount = count;
          mode = currentValue;
        }
      }

    }

    return mode;
  }
}