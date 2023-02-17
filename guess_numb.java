/*
Im Writing as the original bryan i adding these comment as change
*/
import java.util.Scanner;

public class guess_numb
{
	public static void main(String[] args)
	{
	    int i ,inc=1;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter size");
	    int size = in.nextInt();
		int[] arr = new int[size];
		//for binary search below variables
		int low=0,high=size-1,mid=0,flag=0;
	
		for(i=0;i<size;i++)
		{
		    arr[i] = inc;
		    inc++;
		}
		
		System.out.println(size+" numbers below");
		for( i =0;i<size;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		//doing binary search guessing 
		while(low<=high)
		{
		    if(flag==1)
		    {
		        break;
		    }
		    mid = (low+high)/2;
		    System.out.println("IS it greatrer or less than "+arr[mid]);
		    
		    System.out.println("Enter 1:less and 2:greater 3:mid");
		    int choice = in.nextInt();
		    
		    switch(choice)
		    {
		        case 1: high = mid-1; System.out.println("between "+arr[low]+" "+arr[high]); break;
        		
        		case 2: low = mid+1; System.out.println("between "+arr[low]+" "+arr[high]); break;
                case 3: flag++; break;
                default: System.out.println("TRY AGAIN");
		    }
		}
		
		if(flag==1)
		    System.out.println(arr[mid]+" is there");
		else
		    System.out.println(" is NOT there");
	}
}
