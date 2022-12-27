import java.util.*;
import java.util.Collections;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().trim();
        int n = sc.nextInt();

        System.out.println(pal(str.split(""),n));
    }

    public static String pal(String[] str, int n){
        int count = 0;
        int fIdx=0;
        int lIdx=str.length-1;

        List<String> arr1 = new ArrayList<>(Arrays.asList(str));
        List<String> arr2 = new ArrayList<>(Arrays.asList(str));
        Collections.reverse(arr2);

        while(true){
            if(arr1.equals(arr2)){
                return "True";
            } else if(n==count){
                return "False";
            }

            if(!arr1.get(fIdx).equals(arr1.get(lIdx))){
                arr1.remove(fIdx);
                arr2.remove(lIdx--);
                count++;
            } else{
                fIdx++;
                lIdx--;
            }
        }
    }
}
