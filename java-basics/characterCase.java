/// Change the case of the character entered. (using operators only). 

import java.util.Scanner;

class Case{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char input = sc.next().charAt(0);
        char changed = input >='a' && input <='z' ? (char)(input -'a' + 'A' ): (char)(input -'A' + 'a');
        System.out.println("Changed case for "+input+" : " +changed);
    }
}