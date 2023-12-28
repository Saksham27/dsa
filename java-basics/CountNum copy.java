import java.util.Scanner;

class CountNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        byte toCount = sc.nextByte();
        byte count = 0;
        while(input >0){
            if(input%10 == toCount){
                count++;
            }
            input = input/10;
        }
        System.out.printf("Count of %d is %d", toCount,count);
    }
}