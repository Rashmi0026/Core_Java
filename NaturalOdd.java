import java.util.*;

class NaturalOdd{
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter n value");
 for(int i=sc.nextInt(),n=1;i>=n;i--)
{
   if(i%2==1)
  System.out.println(i);
}
}
}