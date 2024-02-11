package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

        public static void main(String[] args) {
            List<Integer> arr = new ArrayList<>(Arrays.asList(3, 4, 5, 4, 6, 7, 7));

            System.out.println("ArrayList before removing duplicates: " + arr);

            // Using a for loop to remove duplicates
            for (int i = 0; i < arr.size(); i++) {
                //Integer currentElement = arr.get(i);
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(i).equals(arr.get(j))) {
                        arr.remove(j);
                       // j--; // Decrement j to adjust for the removed element
                    }
                }
            }

            System.out.println("ArrayList after removing duplicates: " + arr);
        }
    }


