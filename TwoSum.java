import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=10;
        int len = arr.length;
        int[] res = new int[2];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]+arr[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        System.out.print(Arrays.toString(res));
    }
}
