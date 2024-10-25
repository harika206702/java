public class Room
{
public static void main (string[]args)
{
int []arr=new int[] {5,2,8,7,1};
int temt=0;
System.out.println("Elements of original array:");
For(int i=o;i<arr.length;i++)
{
System.out.println(arr[i]+" ");
}
For(int i=o;i<arr.length;i++)
{
For(int j=o;i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i=]=arr[j];
arr[j]= temp;
   }
 }
}
System.out.println();
System.out.println("Elements of array sortred in ascending order;");
for(int i=o;i<arr.length;i++)
{
System.out.println(arr[i]+" ");
 }
}





