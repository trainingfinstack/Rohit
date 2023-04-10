import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int[] arr ={3,4,2,1,5};
        bubbleSort(arr);
        System.out.println("Descending order ---"+Arrays.toString(arr));
    }
    public static void bubbleSort(int[] nums){
        int n = nums.length;
        for(int i = 0; i<n; i++){
            for (int j = i+1; j < n; j++) {
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

