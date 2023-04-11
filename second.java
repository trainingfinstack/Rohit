import java.util.Arrays;

public class second {
    public static void main(String[] args) {
        int[] arr ={3,4,2,1,5};
        elementPow(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void elementPow(int[] nums){
        for(int i = 0; i<nums.length; i++){
            nums[i] = (int)Math.pow(nums[i],2);
        }
    }
}
