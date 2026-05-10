import java.util.*;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int totalUnits = 0;

        for(int i = 0; i < boxTypes.length; i++) {

            int boxes = boxTypes[i][0];
            int units = boxTypes[i][1];

            int takeBoxes;

            if(boxes <= truckSize) {
                takeBoxes = boxes;
            }
            else {
                takeBoxes = truckSize;
            }

            totalUnits += takeBoxes * units;

            truckSize -= takeBoxes;

            if(truckSize == 0) {
                break;
            }
        }

        return totalUnits;
    }
}