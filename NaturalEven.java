import java.util.*;

class NaturalEven{
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter n value");
 for(int i=1,n=sc.nextInt();i<=n;i++)
{
  if(i%2==0)
  System.out.println(i);
}
}
}