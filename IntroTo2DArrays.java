import java.util.Arrays;
import java.util.Collections;

public class IntroTo2DArrays{

  public static void main(String[] args){
    int[][] twoDee = new int[3][5];
    int value = 1;

    //store incremental values in row major order
    for(int row = 0; row<twoDee.length; row++)
    {
      for(int col = 0; col<twoDee[row].length; col++)
      {
        twoDee[row][col] = value;
        value++;
      }
      //one row completed
      System.out.println(Arrays.toString(twoDee[row]) + "\n");
    }

    int sum = 0;
    for(int row = 0; row<twoDee.length; row++)
    {
      for(int col = 0; col<twoDee[row].length; col++)
      {
        sum += twoDee[row][col];
      }
      System.out.println("Row " + row + ": " + sum);
      sum = 0;
    }
    System.out.println("\n");

    //Print out the sum of each column in the following format:
    //Column 0: ??
    //Column 1: ??
    for(int col = 0; col<twoDee[0].length; col++)
    {
      sum = 0;
      for(int row = 0; row<twoDee.length; row++)
      {
        sum += twoDee[row][col];
      }
      System.out.println("Column " + col + ": " + sum);
    }
    
  }
}
