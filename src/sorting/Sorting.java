
import java.util.Scanner;

public class HeapSort 
    
    {

        static void heapify(int[] arr, int length, int i) 
        {
            int leftChild = 2*i+1;
            int rightChild = 2*i+2;
            int largest = i;
            // if the left child is larger than parent
            if (leftChild < length && arr[leftChild] > arr[largest]) 
            {
                largest = leftChild;
            }

            // if the right child is larger than parent
            if (rightChild < length && arr[rightChild] > arr[largest]) 
            {
                largest = rightChild;
            }

            // swap a values using temp
            if (largest != i) 
            {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                heapify(arr, length, largest);
            }
        }
        public static void main(String[] args) 
        
        {
            Scanner sc=new Scanner(System.in);
            int len,i;
            
            //get the input array length from user
            len = sc.nextInt();
            int arr[]=new int[len]; 
            
            //get the input for array elements
            for(i=0;i<len;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            //print the array before sorting
            System.out.println("Array Element Are : ");
            for(i=0;i<len;i++)
                System.out.printf("%d ",arr[i]);
            System.out.println("\n");
            
            
            for (i = len / 2 - 1; i >= 0; i--)  
                heapify(arr, len, i); 
            
            for ( i = len-1; i >= 0; i--) 
            {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                heapify(arr, i, 0);
            }
            
            //print the array after sorting
            System.out.println("Sorted Array Element Are : ");
            for(i=0;i<len;i++)
                System.out.printf("%d ",arr[i]); 
        }
    
}
