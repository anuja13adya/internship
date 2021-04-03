public class Sum {
    public static void main(String[] args)
    {
        int x=12345,t=0,ans=0,rem=0;
        while(t<2)
        {
            if(t==1)
           { rem=x%10;
            ans+=rem;
            }
            x=x/10;
            t++;
        }
        
        while(t<5)
        {
            if(t==4)
            {
                rem=x%10;
               
                ans+=rem;
               
            }
            x=x/10;
            t++;
        }
        System.out.println(ans);
    }
    
}
