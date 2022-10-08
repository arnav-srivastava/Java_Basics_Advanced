public class array {
    public static void main(String args[]){
        // Method 1
        //int arr[]=new int[5];
        //  Method 2
        int arr[] = {1,12,13,4,5,45,65,65};
        // int even =0;
        // int odd = 0;
        // for (int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]%2==0){
        //         even++;
        //     }
        //     else
        //     {
        //         odd++;
        //     }
        // }
        int temp;
        int size = arr.length;

      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){

            if(arr[i]>arr[j]){
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
        System.out.println("2nd higest no is :"+arr[size-2]);
    }
}
