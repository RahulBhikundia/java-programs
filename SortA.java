public class SortA {
    public static void main(String s[]){
        int arr[] = {2,5,3,8,1,6,4,9,0,7};
        int n = 10;

        System.out.println("Array before Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for(int pass=1;pass<n;pass++){
            for(int i=0;i<(n-pass);i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("\nArray after Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
