import java.util.Scanner;

public class QuickSort {
	public static int findPivot(int arr[],int si,int ei){
	       int pivot=arr[ei];
	       int i=si-1;
	       for(int j=si;j<ei;j++){
	         if(arr[j] < pivot){
	            i++;
	            int temp=arr[j];
	            arr[j]=arr[i];
	            arr[i]=temp;
	         }
	       }
	       i++; 
	       int temp=arr[ei];
	       arr[ei]=arr[i];
	       arr[i]=temp;
	       return i;
	   } 
	
	   public static void quickSort(int arr[],int si,int ei){
	       if(si>ei){
	        return;
	       }
	       int pivot=findPivot(arr,si,ei);
	       quickSort(arr,si,pivot-1);
	       quickSort(arr, pivot+1, ei);
	   }
	   
	   public static void main(String args[]) {
		   Scanner scan=new Scanner(System.in);
			System.out.print("enter lenght of array :");
		      int len=scan.nextInt();
		      int arr[]=new int[len];
		       System.out.println();
		      System.out.println("enter the elements of array");
		      for(int i=0;i<=arr.length-1;i++){
		           System.out.print("enter "+i+" element of array:");
		           arr[i]=scan.nextInt();
		      }
		      System.out.println();
		      quickSort(arr,0,arr.length-1);
		      for(int i=0;i<=arr.length-1;i++){
				    System.out.print(arr[i]+" ");
			    }
	   }
}
