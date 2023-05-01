public class PrimeNumber_ingivenRange {
    public static void main (String[]args){


        for(int no=10;no<=100;no++)
        {
            int temp=0;
            for(int j=2;j<=no-1;j++)
            {
                if(no%j==0){
                    temp=temp+1;
                }
            }
            if (temp==0)
            {
                System.out.println(no + " "+ "the total prime numbers are");
            }
            else {
                temp=0;
            }
        }
    }
}
