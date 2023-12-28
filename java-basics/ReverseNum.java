import java.util.Scanner;

class ReverseNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int reverse =0;

        while(input >0){
            reverse = input%10 + reverse*10;
            input/=10;
        }
        System.out.printf("Reverse of %d is %d", input,reverse);
    }
}


x > 1 and 1 and itself are factor

2
3
4