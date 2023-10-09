public class Main
{
	public static void main(String[] args) {
	    int arr[]={10,55,9,27,7};
	    int max=0;
	   // Scanner sc=new Scanner(System.in);
	   System.out.print("Arrays are :");
	   for(int i=0;i<arr.length;i++){
	      System.out.print(arr[i]+" "); 
	   }
	   for(int i=0;i<arr.length;i++){
	       if(arr[i]>max)
	       {
	           max=arr[i];
	       }
	   }
		System.out.println("Maximum Value :"+max);
	}
}
