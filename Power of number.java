public class Main
{
   public static int power(int x,int n)
    { 
        if(n==0)
        {return 1;
            }
        if(x==0)
        {
            return 0;
        }
            int q=n*power(x,n-1);
            return q;
    }
	public static void main(String[] args) {
	    int x=2,n=7;
	   int ans=power(x,n);
		System.out.println(ans);
	}
}
