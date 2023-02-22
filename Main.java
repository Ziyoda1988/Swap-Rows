import java.util.Arrays;

class Main {
  public static void main(String[] args) {
  

      int[][] arr = { {1,2,3},
                      {4,5,6},    
                      {1,0,1}, // row with min sum
                    };

     System.out.println(Arrays.deepToString(swapFirstRowWithMinRow(arr)));    
                      // {1,0,1}
                    //   {4,5,6}    
                    //   {1,2,3} 
  }


  public static int[][] swapFirstRowWithMinRow(int[][] arr){

    int sumOfOneRow [] = new int [arr.length];
    int sum = 0;
    
   
for(int i =0; i <arr.length;i++){
  sum =0;
  for(int j =0; j< arr[i].length; j++){
    sum += arr[i][j];
  }
sumOfOneRow[i] = sum;
 
}
int minRowIndex = 0;
    for(int i =0;  i <sumOfOneRow.length; i ++) {
      if(sumOfOneRow[i] == sum)
        minRowIndex = i;
    }


    //swap
    for(int i =0; i <arr.length;i++){

  for(int j =0; j< arr[i].length; j++){
    int temp = arr[0][j];
    arr[0][j] = arr[minRowIndex][j];
    arr[minRowIndex][j] = temp;

  }
    }
    return arr;
  }
}