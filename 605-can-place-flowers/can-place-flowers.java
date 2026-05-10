class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;

        for(int i = 0; i < flowerbed.length; i++) {

            if(flowerbed[i] == 0) {

                int left;

                if(i == 0){
                    left = 0;
                }
                else{
                    left = flowerbed[i - 1];
                }

                int right;

                if(i == flowerbed.length - 1){
                    right = 0;
                }
                else{
                    right = flowerbed[i + 1];
                }

                if(left == 0 && right == 0){

                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }
}