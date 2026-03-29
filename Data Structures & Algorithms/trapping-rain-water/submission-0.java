class Solution {
    public int trap(int[] height) {
        //get every position's adjacent maxLeftHeight & maxRightHeight
        //min(maxLeftHeigh, maxRightHeight) - height[i]
        
        //getting every position's adjacent maxLeftHeight
        int len = height.length;
        int[] maxLeftHeight = new int[len];
        int maxLHt = maxLeftHeight[0] = 0;
        for (int i=1; i < len; i++) {
            maxLeftHeight[i] = maxLHt = Math.max(maxLHt, height[i-1]);
        }
        //System.out.println(Arrays.toString(maxLeftHeight));

        //getting every position's adjacent maxRightHeight
        int[] maxRightHeight = new int[len];
        int maxRHt = maxRightHeight[len-1] = 0;
        for (int i = len-2; i >= 0; i--) {
             maxRightHeight[i] = maxRHt = Math.max(maxRHt, height[i+1]);
        }
        // System.out.println(Arrays.toString(maxRightHeight));
        int maxArea = 0;
        for (int i=0; i<len; i++) {          
        //    System.out.println("i-"+i + " maxLeftHeight[i]-"+maxLeftHeight[i] + " maxRightHeight[i]-"+maxRightHeight[i] + "  height[i]-"+ height[i] + " ans-"+ (Math.min(maxRightHeight[i], maxLeftHeight[i]) - height[i]));           
            int trap = (Math.min(maxRightHeight[i], maxLeftHeight[i]) - height[i]);
            if (trap > 0) {
                maxArea = maxArea + trap;
            }
        }
        return maxArea;
    }
}
