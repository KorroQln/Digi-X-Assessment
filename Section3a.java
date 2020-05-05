import java.util.*;

public class Section3a {
    public static void main(String args[]){ 
        ArrayList<Integer> arrayListNum = new ArrayList<Integer>(); 
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                    arrayListNum.add(i);
            }
        }
        System.out.println("Results: " + arrayListNum); 
    }  
}