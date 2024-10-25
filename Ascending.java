public class Ascending
{
  public static void main(String[]args)
  {
     int a[] = {1,2,3,4,5};
     int temp = 0;
     for(int i=0; i<a.length; i++)
     {
       System.out.println(a[i]);
     }
     for(int i=0;i<a.length;i++)
     {
       for(int j=i+1; j<a.length; j++)
       {
         if(a[i] < a[j])
         {
           temp = a[i];
           a[i] = a[j];
           a[j] = temp;
         }
       }
     }
     System.out.println();
     for(int i=0; i<a.length; i++)
     {
       System.out.println(a[i]);
     }
  }
}
     