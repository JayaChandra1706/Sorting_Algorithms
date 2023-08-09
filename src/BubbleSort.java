import java.util.Scanner;
public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		  int temp=0;
	      for(int i=0;i<=arr.length-2;i++){
	          for(int j=0;j<=arr.length-2-i;j++){
	              if(arr[j]>arr[j+1]){
	                  temp=arr[j+1];
	                  arr[j+1]=arr[j];
	                  arr[j]=temp;
	              }
	          }
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
	      bubbleSort(arr);
	}
}
	


