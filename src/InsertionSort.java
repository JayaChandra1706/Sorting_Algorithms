import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int arr[]) {
		int item,j;
		for(int i=1;i<=arr.length-1;i++) {
			item=arr[i];
			j=i-1;
			while(j >= 0 && item < arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
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
	      insertionSort(arr);

	}

}
