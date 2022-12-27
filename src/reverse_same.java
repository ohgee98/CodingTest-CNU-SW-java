import java.util.Scanner;
import static java.lang.Math.round;

public class reverse_same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int answer = rs(a);
        System.out.println(answer);
    }

    public static int rs(int temp){
        // 뒤집어도 같은 수 조건 : 1, 0, 8, 69 쌍
        // 홀수의 경우 중간에 0,8 들어갈 수 있음
        // 짝수인 경우는 쌍을 이뤄야함
        // 뒤집어도 같아지려면 각 쌍이 같아져야 함
        // 무조건 시작은 1 6 8 9 가 됨
        int num = round(temp/2);
        int product = (int)Math.pow(5,num-1);
        int ans = 4;

        if(temp==2){
            return ans;
        }
        else{
            if((temp%2)==0){ //짝수
                return ans*product;
            }
            else{
                if(temp==3){
                    product=1;
                }
                return ans*product*3;
            }
        }

    }

}
