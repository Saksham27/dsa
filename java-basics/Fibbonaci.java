class Fibbonaci{
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int temp;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i=1;i<=10;i++){
            System.out.print(a+b + " ");
            temp = a+b;
            a = b;
            b= temp;

        }

    }
}