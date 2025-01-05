package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListAndArrayListToArray {

    public static void main(String[] args) {
        String[] array = {"dhaka", "comilla", "sylhet", "noakhali","khulna"};
        System.out.println(array);

        System.out.println("convert that array to arraylist");
        // convert that array to arraylist

        ArrayList ak = new ArrayList(Arrays.asList(array));
        System.out.println(ak);
        ak.add("rajshahi");
        System.out.println(ak);

        System.out.println("convert the arraylist to array again");
        // convert the arraylist to array again
        String[] arr = (String[]) ak.toArray(new String[ak.size()]);
        for( String ab:arr){
            System.out.println(ab);
        }

    }
}
