import java.util.Scanner;

public class SelectionSort {
	
	
	public static void selectionSort(int arr[]) {
		 int temp=0;
	        for(int i=0;i<=arr.length-2;i++){
	            int min=arr[i];
	            int pos=i;
	            for(int j=i+1;j<=arr.length-1;j++){
	                if(arr[j]<min){
	                    min=arr[j];
	                    pos=j;
	                }
	            }
	            temp=arr[pos];
	            arr[pos]=arr[i];
	            arr[i]=temp;
	        }
	      for(int i=0;i<=arr.length-1;i++){
	      System.out.print(arr[i]+" ");
	      }
	}

	public static void main(String[] args) {
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
	      selectionSort(arr);

	}

}
