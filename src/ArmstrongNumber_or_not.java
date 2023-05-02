public class ArmstrongNumber_or_not {
    public static void main(String[]args){
        int num=153;
        int leng=0;
        int t1=num;
        while (t1!=0){
            leng=leng+1;
            t1=t1/10;
        }
        int t2=num;
        int arm=0;
        while (t2!=0){
            int mul=1;
            int rem=t2%10;
            for (int i=1;i<=leng;i++){
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;

        }
        if (arm==num){
            System.out.println(num+" "+ "is Armstrong Number");
        }
        else {
            System.out.println(num+" "+ "is  not Armstrong Number");
        }
    }
}
