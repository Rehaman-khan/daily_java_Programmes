public class sumof_digits {
    public static void main (String[]args){
        int num=12345,sum=0,r;
        while (num>0){
            r=num%10;
            sum=sum+r;
            num=num/10;

        }
        System.out.println(sum);
    }
}
