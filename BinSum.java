public class BinSum {
  public static void main(String[] args) {
    int binNum[][] = {
    {0, 1, 1, 0},
    {0, 1, 1, 1}, 
    {1, 0, 1, 0}
    };
    
    int sum = 0;
    int[] rowSum = new int[binNum.length];
    
    for(int i = 0; i < binNum.length; i++) {
      for(int j = 0; j < binNum[i].length; j++) {
        if(binNum[i][j] == 1) {
          sum++;
          rowSum[i] = sum;
        }
      }
      sum = 0;
    }
    
    for(int i = 0; i < binNum.length; i++) {
      for(int j = 0; j < binNum[i].length; j++) {
        System.out.print(binNum[i][j] + " ");
      }
      System.out.println();
    }
    
    System.out.println("\nPrinting the numbers of 1s by row...");
    
    for(int k = 0; k < binNum.length; k++) {
      System.out.println("Row " + k + " has " + rowSum[k] + " 1s.");
    }
    System.out.println();
    
    int max = 0;
    int index = 0;
    for(int m = 0; m < binNum.length; m++) {
      if(rowSum[m] > max) {
        max = rowSum[m];
        index = m;
      }
    }
    
    System.out.println("Row with the most 1s:" + index +
                       "\nNumber of 1s: " + max);
  }
}