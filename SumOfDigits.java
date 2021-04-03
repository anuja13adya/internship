public class SumOfDigits {
    public static void main(String[] args) {
        {
            int x=123,ans=0;
            while(x>0)
            {
                int rem=x%10;
                ans+=rem;
                x=x/10;
            }
            System.out.println(ans);
        }
    }
}
