import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        String[] arr = sc.split(" ");
        int count = 0;

        List<String> temp1 = new ArrayList<>(List.of(arr[0].split("")));
        List<String> temp2 = new ArrayList<>(List.of(arr[1].split("")));

        while(!temp1.isEmpty()){
            if(count==temp2.size()){
                break;
            }

            if(temp1.contains(temp2.get(count))){
                temp1.remove(temp2.get(count));
            }

            count++;
        }

        if(temp1.isEmpty()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }



    }



}
