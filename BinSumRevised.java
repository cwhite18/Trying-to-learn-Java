import java.util.ArrayList;

public class BinSumRevised {
  public static void main(String[] args) {
    //declare and intialise a 2D array
    int binNum[][] = {
    {0, 1, 1, 0},
    {0, 1, 1, 1}, 
    {1, 0, 1, 0}
    };
    
    //declare and initialise the 1D array
    //first we must set sum to 0
    int sum = 0;
    int[] rowSum = new int[binNum.length];
    
    //iterates over the 2d array
    for(int i = 0; i < binNum.length; i++) {
      for(int j = 0; j < binNum[i].length; j++) {
        //compares the current index to 1
        //if value in index = 1, add one to sum
        if(binNum[i][j] == 1) {
          sum++;
          //after sum has been incremented, assign sum to the 1d array
          rowSum[i] = sum;
        }
      }
      //reset sum to 0 for iteration over next row
      sum = 0;
    }
    
    //prints out 2D array
    for(int i = 0; i < binNum.length; i++) {
      for(int j = 0; j < binNum[i].length; j++) {
        System.out.print(binNum[i][j] + " ");
      }
      System.out.println();
    }
    
    System.out.println("\nPrinting the numbers of 1s by row...");
    
    //prints out every index in 1D array
    for(int k = 0; k < binNum.length; k++) {
      System.out.println("Row " + k + " has " + rowSum[k] + " 1s.");
    }
    System.out.println();
    
    //sets max 1s to 0 and index to 0 for starting point
    int max = 0;
    int index = 0;
    
    //iterates over the 1D Array
    for(int m = 0; m < binNum.length; m++) {
      //if value in row is greater than max, replace it and set index to iteration
      if(rowSum[m] > max) {
        max = rowSum[m];
        index = m;
      }
    }
    
    //prints out the index of the row with most 1s and prints amount of 1s in that row
    System.out.println("Row with the most 1s:" + index +
                       "\nNumber of 1s: " + max + "\n");
    
    //declare and initialise the ArrayList
    //first we must set sum to 0
    int sumAL = 0;
    ArrayList <Integer> rowAL = new ArrayList <Integer> ();
    
    //iterates over the 2d array
    for(int ii = 0; ii < binNum.length; ii++) {
      for(int jj = 0; jj < binNum[ii].length; jj++) {
        //compares the current index to 1
        //if value in index = 1, add one to sumAL
        if(binNum[ii][jj] == 1) {
          sumAL++;
          //after sum has been incremented, assign sum to the ArrayList
          rowAL.add(ii, sumAL);
        }
      }
      //reset sum to 0 for iteration over next row
      sumAL = 0;
    }
    
    //prints out every index in ArrayList
    for(int kk = 0; kk < binNum.length; kk++) {
      System.out.println("Row " + kk + " has " + rowAL.get(kk) + " 1s.");
    }
    System.out.println();
    
    //sets max 1s to 0 and index to 0 for starting point
    int maxAL = 0;
    int indexAL = 0;
    
    //iterates over the ArrayList
    for(int mm = 0; mm < binNum.length; mm++) {
      //if value in row is greater than maxAL, replace it and set index to iteration
      if(rowAL.get(mm) > maxAL) {
        maxAL = rowAL.get(mm);
        indexAL = mm;
      }
    }
    
    //prints out the index of the row with most 1s and prints amount of 1s in that row
    System.out.println("Row with the most 1s:" + indexAL +
                       "\nNumber of 1s: " + maxAL);
    
    
    
  }
}