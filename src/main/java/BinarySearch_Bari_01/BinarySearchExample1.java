package BinarySearch;

public class BinarySearchExample1 {

  public static int binarySearch(int[] arr, int key){

      int lowVal = 1;
      int highVal = arr.length;
      int midVal=0;

      while (lowVal<= highVal){
          midVal =(lowVal+highVal)/2;
          if(key==arr[midVal])
              return midVal ;
          if(key<arr[midVal])
              highVal = midVal -1;
          else lowVal = midVal +1;
      }
      return -1;
  }

    public static void main(String[] args) {
        int[]arr = {3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
       // System.out.println(arr.length);
        System.out.println(" position of the key : 42  :" + binarySearch( arr,42));
        System.out.println(" position of the key : 12  :" + binarySearch( arr,12));
        System.out.println(" position of the key : 30  :" + binarySearch( arr,30));
    }
}
