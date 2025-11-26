package MonotonicStack;

import java.util.Stack;



public class LargestRectangleInHistogram84 {
    public static void main(String[] args) {
        int[] rectangles = {2,1,2};
        int result2 = largestRectangleArea(rectangles);
        System.out.println(result2);

        //[2,1,2]
    }


    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? heights.length : heights.length - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }

}
