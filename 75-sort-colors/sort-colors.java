class Solution {
    public void sortColors(int[] nums) {
        sortcolor(nums);
    }

    public static void sortcolor(int[] arr) {
        int countzeroes = 0;
        int countone = 0;
        int counttwo = 0;

        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                countzeroes++;
            } 
            else if(arr[i] == 1){
                countone++;
            } 
            else{
                counttwo++;
            }
        }

        int i = 0;

        while(countzeroes > 0){
            arr[i++] = 0;
            countzeroes--;
        }

        while(countone > 0){
            arr[i++] = 1;
            countone--;
        }

        while(counttwo > 0){
            arr[i++] = 2;
            counttwo--;
        }
    }
}