package ArrayConcept;

import java.util.Arrays;

public class ArraySorting {

/*    public static int[] sortArray(int[] inArray){
        int[] newArray = inArray;
        for( int x=0; x<newArray.length; x++){

            int tempValue = newArray[x];
            int tempIndex = x;
            for( int y=x+1; y<newArray.length; y++){
                if( tempValue < newArray[y]){
                    newArray[x]= tempValue;
                }
            }
        }
        return  newArray;
    }*/

    public static void main(String[] args) {
        int[] ab={1,2,3,4,5};
        int[] cd={5,4,3,2,1};

        int[] dd = sortArray(ab);
        int[] ee = sortArray(cd);

        for( int ab1:dd){
            System.out.println(ab1);
        }

        for( int cd1:ee){
            System.out.println(cd1);
        }
        if(Arrays.equals(sortArray(ab),sortArray(cd))){
            System.out.println("both arrays are same");
        }
        else {
            System.out.println("both arrays are not same");
        }
    }

    public static int[] sortArray(int[] inArray){
        int[] input = inArray;
        int temp=0;


        for(int i = 0; i< input.length; i++)
        {
            for(int j = 0; j< input.length-1; j++)
            {
                if(input[j+1]<input[j])
                {
                    temp=input[j+1];
                    input[j+1]=input[j];
                    input[j]=temp;
                }
            }
        }
        return  input;
    }
}
