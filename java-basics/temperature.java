// Write a program to convert temperature given in Celsius (user input) to Fahrenheit. 
import java.util.Scanner;
class Temp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Option : \n1. Fahrenheit to Celcius\n2.Celcius to Fahrenheit");
        System.out.print("Your Temp : ");
        float temp = sc.nextFloat();
        System.out.print("Your Option : ");
        byte input = sc.nextByte();
        System.out.println(input);
        float converted;
        switch(input){
            case 1:
                converted = (temp-32)*(5.0f/9);
                System.out.printf("Celcius : %.2f",converted);
                break;
            case 2:
                converted = temp*(9.0f/5)+32;
                System.out.printf("Fahrenheit : %.2f",converted);
                break;
            default:
                System.out.print("Wrong option!!!");
                break;
        }
    }
}