import java.util.Scanner;

class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Is Armstrong : "+ isArmstrong(input));
        
    }

    static boolean  isArmstrong(int n){
        long sum = 0;
        int temp = n;
        while(temp>0){
            int x = temp%10;
            sum +=  x*x*x;
            temp /=10;
        }
        return sum == n ;
    }

    
}