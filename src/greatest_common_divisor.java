import java.util.Scanner;
public class greatest_common_divisor {
    public static int gcd(int first, int second){
        int temp = first%second;

        if(temp!=0){
            return gcd(second,temp);
        }
        else {
            return second;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer=gcd(a,b);

        System.out.println(answer);
    }
}
