import java.util.*;

public class Section3b {
    public static void main(String args[]){ 
        Scanner in = new Scanner(System.in);
        String varStr = in.nextLine();  
        while (!varStr.equals("")) {
            palindrome(varStr);
            varStr = in.nextLine();
        }
    }

    static void palindrome(String varStr) {
        String varCheck="";
        int n = varStr.length();
        for(int j = n-1; j >= 0; j--){
            varCheck = varCheck + varStr.charAt(j);
        }
        if(varStr.equalsIgnoreCase(varCheck)){
            System.out.println("'" + varStr + "' -> True");
        }else{
            System.out.println("'" + varStr + "' -> False");
        }
    }
}