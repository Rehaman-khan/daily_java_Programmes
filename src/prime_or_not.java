public class prime_or_not {
    public static void main (String[]args){
        int num=7;
        int temp=0;
        for(int i=2;i<=num-1;i++) {
            if (num == 0) {
                temp = temp + 1;
            }
        }
            if (temp==0){
                System.out.println(num+" "+ "is prime number");
            }
            else {
                System.out.println(num+" "+ "not  prime number");
            }
        }
    }

