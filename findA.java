public class findA {
    public static void main(String s[]){
        int arr[] = {1,6,3,5,2};
        int n = Integer.parseInt(s[0]);
        int found = 0;
        //Linear Search
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                found = 1;
            }
        }

        if(found == 1){
            System.out.println(n+" found in Array!!");
        }
        else{
            System.out.println(n+" not found in Array");
        }
    }
}
